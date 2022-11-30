package com.sg.signserver.ws.admin.test;

import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.junit.jupiter.api.Test;
import org.signserver.adminws.AdminWSService;
import org.signserver.adminws.WsWorkerConfig;
import org.signserver.adminws.WsWorkerConfig.Properties;
import org.signserver.adminws.WsWorkerConfig.Properties.Entry;

public class WsADminDestroyWorker {
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(
		        (hostname, session) -> hostname.equals("ss.gehirn.org"));
	}

	@Test
	public void tes() throws Exception {
		URL wsdlLocation = new URL(
		        "https://ss.gehirn.org:8443/signserver/AdminWSService/AdminWS?wsdl");
		AdminWSService adminWsService = new AdminWSService(wsdlLocation);

		int cryptoTokenWorkerId = 10;
		WsWorkerConfig workerConfig = adminWsService.getAdminWSPort()
		        .getCurrentWorkerConfig(cryptoTokenWorkerId);
		Properties properties = workerConfig.getProperties();
		List<Entry> entries = properties.getEntry();

		for (Entry entry : entries) {
			boolean result = adminWsService.getAdminWSPort().removeWorkerProperty(
			        cryptoTokenWorkerId, (String) entry.getKey());
			System.out.println("remove " + entry.getKey() + ": " + result);
			if(!result) {
				break;
			}
		}

	}
}
