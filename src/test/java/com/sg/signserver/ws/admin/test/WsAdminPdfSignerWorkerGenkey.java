package com.sg.signserver.ws.admin.test;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;

public class WsAdminPdfSignerWorkerGenkey {
	static {
	    HttpsURLConnection.setDefaultHostnameVerifier(
	    		(hostname, session) -> hostname.equals("ss.gehirn.org"));
	}
	@Test
	public void tes() throws Exception {

		URL wsdlLocation = new URL(
		        "https://ss.gehirn.org:8443/signserver/AdminWSService/AdminWS?wsdl");
		AdminWSService adminWsService = new AdminWSService(wsdlLocation);
		int workerId = adminWsService.getAdminWSPort()
		        .getWorkerId("PDFSigner_4api_1");
		System.out.println("workerId = "+workerId);
		// genkey first
		String generateSignerKey = adminWsService.getAdminWSPort().generateSignerKey(
		        workerId, "RSA", "3072", "generatedkey_from_api_001", "foo123");
		System.out.println(generateSignerKey);
//		adminWsService.getAdminWSPort().
		// tidak ada efek apapun?
	}
}
