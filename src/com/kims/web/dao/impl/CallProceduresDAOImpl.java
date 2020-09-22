package com.kims.web.dao.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kims.web.dao.CallProceduresDAO;

@Repository
public class CallProceduresDAOImpl implements CallProceduresDAO{
	
	
	@Autowired
	@Resource(name="sqlSession")
	private SqlSession query;
	
	@Override
	public void callMigrationQA(String fname) {
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("fname", "");
		Object call_return = query.selectOne("callMigrationQA", param);
		
		System.out.println("call_return :: " + call_return);
		
	}

}
