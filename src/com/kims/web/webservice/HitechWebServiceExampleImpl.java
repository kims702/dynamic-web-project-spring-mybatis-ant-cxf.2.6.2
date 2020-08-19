package com.kims.web.webservice;

import javax.jws.WebService;

@WebService(endpointInterface = "com.kims.web.webservice.HitechWebServiceExample")
public class HitechWebServiceExampleImpl implements HitechWebServiceExample{
	
	@Override
	public String Call_WSID_NAME(String wsid_name) {
		// com.kims.web.webservice.HitechWebServiceExampleImpl
		return wsid_name;
	}
	
	@Override
	public String fQAM002sendMail(String wsid_name) {
		// TODO Auto-generated method stub
		return wsid_name;
	}

}
