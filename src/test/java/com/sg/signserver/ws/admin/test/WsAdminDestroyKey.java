package com.sg.signserver.ws.admin.test;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;

public class WsAdminDestroyKey {
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
				.getWorkerId("CryptoTokenP12_4api_1");
		System.out.println("workerId = "+workerId);
		boolean result = adminWsService.getAdminWSPort().destroyKey(workerId, 0);
		System.out.print(result);
	}
}
