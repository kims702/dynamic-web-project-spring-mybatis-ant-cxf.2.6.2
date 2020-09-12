package com.kims.web.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kims.web.dao.iHptbMenuDAO;

@Service
public class HptbMenuServiceImpl implements iHptbMenuService{
	
	@Autowired
	private iHptbMenuDAO dao ; 
	
	@Override
	public List<HashMap<String, Object>> selectHptbMenu() {
		List<HashMap<String, Object>> list = dao.selectHPTB_MENU();
		
		return list;
	}

}
