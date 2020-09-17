package com.kims.web.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kims.web.dao.iHptbMenuDAO;


@Repository
public class HptbMenuDAOImpl implements iHptbMenuDAO {

	
//	@Resource(name="sqlSession")
	
	@Autowired
	@Resource(name="sqlSession")
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
