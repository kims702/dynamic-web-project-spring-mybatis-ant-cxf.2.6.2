package com.kims.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kims.web.dao.CallProceduresDAO;
import com.kims.web.service.CallProceduresService;

@Service
public class CallProceduresServiceImpl implements CallProceduresService{
	
	
	@Autowired private CallProceduresDAO dao;
	
	@Override
	public void callMigrationQA(String fname) {

		dao.callMigrationQA(fname);
	}

}
