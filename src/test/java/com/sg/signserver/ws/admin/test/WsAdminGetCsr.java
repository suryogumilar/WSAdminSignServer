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

public class WsAdminGetCsr {
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

		WsWorkerConfig workerConfig = adminWsService.getAdminWSPort()
		        .getCurrentWorkerConfig(workerId);

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
		Pkcs10CertReqInfo certReqInfo = new Pkcs10CertReqInfo();
		certReqInfo.setSignatureAlgorithm("SHA256withRSA");
		certReqInfo.setSubjectDN("CN=" + "initest_csr_pdf");

		Base64SignerCertReqData csr0 = adminWsService.getAdminWSPort()
		        .getPKCS10CertificateRequest(workerId, certReqInfo, false);
		System.out.println("\ncsr:");
		System.out.println(new String(csr0.getBase64CertReq()));

	}
}
