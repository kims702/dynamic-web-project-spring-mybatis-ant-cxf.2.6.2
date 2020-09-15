package com.kims.web.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DQAM000DAOImpl implements iDQAM000DAO{
	
	@Autowired
	private SqlSession query;
	
	@Override
	public List<HashMap<String, Object>> S001() {
		List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
		
		list = query.selectList("S001");
		
		return list;
	}

}
