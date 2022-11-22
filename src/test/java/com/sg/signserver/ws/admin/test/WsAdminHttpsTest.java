package com.sg.signserver.ws.admin.test;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;
import org.signserver.adminws.WsWorkerConfig;
import org.signserver.adminws.WsWorkerConfig.Properties.Entry;

public class WsAdminHttpsTest {
	static {
	    HttpsURLConnection.setDefaultHostnameVerifier(
	    		(hostname, session) -> hostname.equals("ss.gehirn.org"));
	}
	@Test
	public void tes() throws Exception {
		URL wsdlLocation = new URL(
				"https://ss.gehirn.org:8443/signserver/AdminWSService/AdminWS?wsdl");
		AdminWSService adminWsService = new AdminWSService(wsdlLocation);
		System.out.println(adminWsService.getAdminWSPort()
				.getWorkerId("CryptoTokenP12"));
		
		WsWorkerConfig wconfig = adminWsService.getAdminWSPort()
				.getCurrentWorkerConfig(2);
		
		List<Entry> entries = wconfig.getProperties().getEntry();
		for (Entry entry : entries) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
}
