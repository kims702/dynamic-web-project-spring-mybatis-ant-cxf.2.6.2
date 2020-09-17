package com.kims.web.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kims.web.dao.iCodeDtlDAO;
import com.kims.web.service.iCodeDtlService;

@Service
public class CodeDtlServiceImpl implements iCodeDtlService{
	
	@Autowired
	private iCodeDtlDAO dao;
	
	@Override
	public List<HashMap<String, Object>> selectCodeDtl() {
		
		List<HashMap<String, Object>> list = dao.selectCodeDtl();
		
		return list;

	}
	

}
