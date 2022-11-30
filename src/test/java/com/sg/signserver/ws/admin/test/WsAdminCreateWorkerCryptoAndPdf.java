package com.sg.signserver.ws.admin.test;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;

public class WsAdminCreateWorkerCryptoAndPdf {
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(
		        (hostname, session) -> hostname.equals("ss.gehirn.org"));
	}

	@Test
	public void tes() throws Exception {

		String cryptoSignerName = "CryptoTokenP12_4api_generated01";
		String keystorePassword = "foo123";
		String aliasKey = "generatedkey_from_api_automated_001";

		int cryptoTokenWorkerId = 10;
		URL wsdlLocation = new URL(
		        "https://ss.gehirn.org:8443/signserver/AdminWSService/AdminWS?wsdl");
		AdminWSService adminWsService = new AdminWSService(wsdlLocation);
		
		
		// create crypto token
		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId, "NAME",
		        cryptoSignerName);
		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId, "TYPE",
		        "CRYPTO_WORKER");

		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId,
		        "CRYPTOTOKEN_IMPLEMENTATION_CLASS",
		        "org.signserver.server.cryptotokens.KeystoreCryptoToken");
		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId,
		        "IMPLEMENTATION_CLASS", "org.signserver.server.signers.CryptoWorker");
		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId,
		        "KEYSTORETYPE", "INTERNAL");
		adminWsService.getAdminWSPort().setWorkerProperty(cryptoTokenWorkerId,
		        "KEYSTOREPASSWORD", keystorePassword);

		
		// genkey first
		String generateSignerKey = adminWsService.getAdminWSPort()
				.generateSignerKey(cryptoTokenWorkerId, "RSA", "3072", 
						aliasKey, keystorePassword);
		System.out.println("gen signer key = "+generateSignerKey);
	}

}
