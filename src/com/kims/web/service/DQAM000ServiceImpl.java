package com.kims.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kims.web.dao.iDQAM000DAO;

@Service
public class DQAM000ServiceImpl implements iDQAM000Service{
	
	@Autowired
	private iDQAM000DAO dao;
	
	
	@Override
	public List<HashMap<String, Object>> S001() {
		List<HashMap<String, Object>> list = dao.S001();
		return list;
	}
	
	

}
