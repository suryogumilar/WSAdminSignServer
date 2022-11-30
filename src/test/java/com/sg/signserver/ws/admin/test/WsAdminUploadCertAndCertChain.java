package com.sg.signserver.ws.admin.test;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;

public class WsAdminUploadCertAndCertChain {
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
		        .getWorkerId(System.getenv("pdfsignername"));
		System.out.println("workerId = " + workerId);
		byte[] bytesnya = Files
		        .readAllBytes(new File(System.getenv("pem_cert")).toPath());
		
		byte[] bytesnya_chain = Files
		        .readAllBytes(new File(System.getenv("pem_cert_chain")).toPath());
		
		List l = new ArrayList<byte[]>();
		l.add(bytesnya);
		l.add(bytesnya_chain);
		
		adminWsService.getAdminWSPort().uploadSignerCertificate(workerId, bytesnya,
				"scope");
		adminWsService.getAdminWSPort().uploadSignerCertificateChain(workerId, 
				l, "scope");
		// reload db for pdf signer
		adminWsService.getAdminWSPort().reloadConfiguration(workerId);

		

	}
}
