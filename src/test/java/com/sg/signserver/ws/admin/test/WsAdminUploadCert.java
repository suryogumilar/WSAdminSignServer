package com.sg.signserver.ws.admin.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;

public class WsAdminUploadCert {
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(
		        (hostname, session) -> hostname.equals("ss.gehirn.org"));
	}

	@Test
	public void tes() throws Exception {
		URL wsdlLocation = new URL(
		        "https://ss.gehirn.org:8443/signserver/AdminWSService/AdminWS?wsdl");

		String alias = "generatedkey_from_api_001_for_pdf";
		AdminWSService adminWsService = new AdminWSService(wsdlLocation);
		int workerId = adminWsService.getAdminWSPort().getWorkerId("PDFSigner_4api_1");
		System.out.println("workerId = " + workerId);
		
		String pem = System.getenv("pem");
		
		byte[] bytesnya=Files.readAllBytes(new File(pem).toPath());
		List l = new ArrayList();
		l.add(bytesnya);
		adminWsService.getAdminWSPort().uploadSignerCertificate(workerId, bytesnya,
				"scope");
		adminWsService.getAdminWSPort().uploadSignerCertificateChain(workerId, 
				l, "scope");
		adminWsService.getAdminWSPort().activateSigner(workerId, "foo123");

	}
}
