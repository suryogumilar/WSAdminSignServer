package com.sg.signserver.ws.admin.test;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;
import org.signserver.adminws.Base64SignerCertReqData;
import org.signserver.adminws.Pkcs10CertReqInfo;
import org.signserver.adminws.WsWorkerConfig;
import org.signserver.adminws.WsWorkerConfig.Properties.Entry;

public class WsAdminCreateWorkerCryptoAndPdf {
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(
		        (hostname, session) -> hostname.equals("ss.gehirn.org"));
	}

	@Test
	public void tes() throws Exception {

		int cryptoTokenWorkerId = 10;
		String cryptoSignerName = "CryptoTokenP12_4api_generated_01";
		String keystorePassword = "foo123";
		String aliasKey = "generatedkey_from_api_automated_001";

		int pdfSignerWorkerId = 11;
		String pdfSignerName = "PdfSigner_generated_4api_01";
		String pdfSignerAliasKey = "generatedkey_pdfsigner_sg1_key_alias_0001";
		
		
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
		String generateSignerKey = adminWsService.getAdminWSPort().generateSignerKey(
		        cryptoTokenWorkerId, "RSA", "3072", aliasKey, keystorePassword);
		System.out.println("gen signer key = " + generateSignerKey);

		// after this the crypto worker should be activated
		
		// ------
		
		// create pdf signer worker
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId, "NAME",
		        pdfSignerName);
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId, "TYPE",
		        "PROCESSABLE");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "ADD_VISIBLE_SIGNATURE", "False");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "AUTHTYPE", "NOAUTH");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "CRYPTOTOKEN", cryptoSignerName);
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "DEFAULTKEY", pdfSignerAliasKey);
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "DIGESTALGORITHM", "SHA256");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "DISABLEKEYUSAGECOUNTER", "true");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "IMPLEMENTATION_CLASS", "org.signserver.module.pdfsigner.PDFSigner");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "LOCATION", "Sentul");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId, "REASON",
		        "And the reason is you");
		adminWsService.getAdminWSPort().setWorkerProperty(pdfSignerWorkerId,
		        "VISIBLE_SIGNATURE_PAGE", "1");

		// reload db for pdf signer
		adminWsService.getAdminWSPort().reloadConfiguration(pdfSignerWorkerId);

		// get cryptotoken signer id for pdf which is number 10
		WsWorkerConfig workerConfig = adminWsService.getAdminWSPort()
		        .getCurrentWorkerConfig(pdfSignerWorkerId);
		String cryptoToken = null;
		List<Entry> entries = workerConfig.getProperties().getEntry();
		for (Entry entry : entries) {
			if (entry.getKey().equals("CRYPTOTOKEN")) {
				cryptoToken = (String) entry.getValue();
				break;
			}
		}
		int signerId = adminWsService.getAdminWSPort().getWorkerId(cryptoToken);
		System.out.println("Cryptotoken:" + cryptoToken + " signer id is:" + signerId);

		// genkey 2nd associated with pdf signer
		String generateSignerKey2 = adminWsService.getAdminWSPort()
		        .generateSignerKey(signerId, "RSA", "3072", pdfSignerAliasKey, "foo123");
		System.out.println("gen signer key alias = " + generateSignerKey2);

		Pkcs10CertReqInfo certReqInfo = new Pkcs10CertReqInfo();
		certReqInfo.setSignatureAlgorithm("SHA256withRSA");
		certReqInfo.setSubjectDN("CN=" + "initest_csr_pdf");

		Base64SignerCertReqData csr0 = adminWsService.getAdminWSPort()
		        .getPKCS10CertificateRequest(pdfSignerWorkerId, certReqInfo, false);
		System.out.println("\ncsr:");
		System.out.println(new String(csr0.getBase64CertReq()));

		
	}

}
