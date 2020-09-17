package com.kims.web.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kims.web.dao.iDQAM000DAO;

@Repository
public class DQAM000DAOImpl implements iDQAM000DAO{
	
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession query;
	
	@Override
	public List<HashMap<String, Object>> S001() {
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		
		list = query.selectList("S001");
		
		return list;
	}

}
