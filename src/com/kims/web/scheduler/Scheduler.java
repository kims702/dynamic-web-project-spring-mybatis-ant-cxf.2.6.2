package com.kims.web.scheduler;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.kims.web.service.iCodeDtlService;
import com.kims.web.service.iDQAM000Service;
import com.kims.web.service.iHptbMenuService;

@Component
public class Scheduler {
	
	
	@Autowired
	private iHptbMenuService service;
	
	@Autowired
	private iDQAM000Service dqamService;
	
	@Autowired private iCodeDtlService codeDtlService; 
	
	
	public void cronCountDQAM() {
		Locale locale = new Locale("alpha-2");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		List<HashMap<String, Object>> list = dqamService.S001();
		
		System.out.println("cronCountDQAM list:" + list.size() + ",  formattedDate : " + formattedDate);
	}
	
	//@Scheduled(cron = "10 * * * * *")
	public void cronHptbMenu() {
		Locale locale = new Locale("alpha-2");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		List<HashMap<String, Object>> list = service.selectHptbMenu();
		
		System.out.println("cronHptbMenu list:" + list.size() + ",  formattedDate : " + formattedDate);
	}
	
	
	public void cronCountTable() {
		Locale locale = new Locale("alpha-2");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		List<HashMap<String, Object>> list = service.selectHptbMenu();
		
		System.out.println("cronCountTable list:::::::" + list.size() + ",  formattedDate : " + formattedDate);
	}
	
	
	
	public void cronMsSQLTable() {
		Locale locale = new Locale("alpha-2");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);
		
		List<HashMap<String, Object>> list = codeDtlService.selectCodeDtl();
		
		System.out.println("cronMsSQLTable list:" + list.size() + ",  formattedDate : " + formattedDate);
	}
	
	

}
