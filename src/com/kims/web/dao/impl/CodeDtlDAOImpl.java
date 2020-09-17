package com.kims.web.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kims.web.dao.iCodeDtlDAO;

@Repository
public class CodeDtlDAOImpl implements iCodeDtlDAO{
	
	@Autowired
	@Resource(name="sqlSession_mssql")
	private SqlSession query;
	
	@Override
	public List<HashMap<String, Object>> selectCodeDtl() {
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		
		list = query.selectList("selectCodeDtl");
		
		return list;
	}

}
