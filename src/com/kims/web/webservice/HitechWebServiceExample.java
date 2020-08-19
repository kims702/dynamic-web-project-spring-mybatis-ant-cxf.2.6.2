package com.kims.web.webservice;

import javax.jws.WebService;

@WebService
public interface HitechWebServiceExample {
	String Call_WSID_NAME(String wsid_name);
	
	String fQAM002sendMail(String wsid_name);

}
