package com.kims.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class HptbMenuDAOImpl implements iHptbMenuDAO {

	
	@Autowired
	private SqlSession query;
	
	@Override
	public List<HashMap<String, Object>> selectHPTB_MENU() {
		// TODO Auto-generated method stub
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
//		list = getSqlSession().selectList("selectLOG");
		
		list = query.selectList("selectHptbMenu");
		return list;
	}
}
