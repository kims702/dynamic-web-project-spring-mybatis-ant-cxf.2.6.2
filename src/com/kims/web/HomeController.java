package com.kims.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.kims.web.service.iCodeDtlService;
import com.kims.web.service.iHptbMenuService;
import com.kims.web.vo.RequestShop;

/**
 * Handles requests for the application home page.
 */


@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	

	@Autowired
	private iHptbMenuService service;
	
	@Autowired private iCodeDtlService codeDtlService; 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * 
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		service.selectHptbMenu();
		
		
		System.out.println(
				"###################____________________ant clean build deploy >> index ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		System.out.println("home ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		return "home";
	}

	@RequestMapping(value = "/jenkins", method = RequestMethod.GET)
	public String jenkins(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		System.out.println("jenkins ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		return "home";
	}
	
	
	/**
	 * 
	 * call url : http://localhost:8080/getProcessPostJson
	 * set paramter : {"WSID_NAME":"value"}
	 * 
	 * 
	 * @param body
	 * @return
	 */
	@RequestMapping(value = "/getProcessPostJson", method = RequestMethod.POST)
	public @ResponseBody Map getProcessPostJson(@RequestBody Map body) {
		
		
		System.out.println("getProcessPost ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("WSID_NAME:" + body.get("WSID_NAME"));
		return body;
	}
	

	@RequestMapping(value = "/getProcessPost", method = RequestMethod.POST)
	public ModelAndView getProcessPost(Locale locale, Model model) {

		System.out.println("getProcessPost ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		logger.info("POST name, age /process/getProcessPost !!!!");
//	  logger.info("POST name, age /process/getProcessPost names : " + requestShop.getName());
//	  logger.info("POST name, age /process/getProcessPost ages : " + requestShop.getAge());
//	  logger.info("POST name, age /process/getProcessPost orderNumber : " + requestShop.getOrderNumber());
		ModelAndView modelAndView = null;
		try {
			logger.info("modelAndView MappingJacksonJsonView SET !!!!");
			modelAndView = new ModelAndView(new MappingJacksonJsonView());
			logger.info("modelAndView MappingJacksonJsonView ED!!!!");
		} catch (Exception e) {
			//
			logger.info("modelAndView EX");
			System.out.println(e.getMessage());
			logger.info("modelAndView !!!!");
		}
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("returnCode", "100");
		map.put("returnMessage", "job_run");
		map.put("call_func", "MAIL_SEND_001");

//	  modelAndView.addObject("name",requestShop.getName());
//	  modelAndView.addObject("age",requestShop.getAge());
		modelAndView.addObject("list", map);

		return modelAndView;
		// return modelAndView.addObject(map);
	}

	
	 @RequestMapping(value="/getProcessPostVO", method=RequestMethod.POST) public
	  ModelAndView getProcessPost(@RequestBody RequestShop requestShop){
	  
	  System.out.println("getProcessPost ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
	  logger.info("POST name, age /process/getProcessPost !!!!");
	  logger.info("POST name, age /process/getProcessPost names : " +
	  requestShop.getName());
	  logger.info("POST name, age /process/getProcessPost ages : " +
	  requestShop.getAge());
	  logger.info("POST name, age /process/getProcessPost orderNumber : " +
	  requestShop.getOrderNumber());
	  
	  System.out.println("WSID_NAME:" + requestShop.getWSID_NAME());
	  
	  ModelAndView modelAndView = new ModelAndView(new MappingJacksonJsonView());
	  
	  HashMap<String, String> map = new HashMap<String, String>(); map.put("name",  "asdfasdf"); map.put("age", "121");
	  
	  
	  modelAndView.addObject("name",requestShop.getName());
	  modelAndView.addObject("age",requestShop.getAge());
	  modelAndView.addObject("list",map);
	  
	  
	  return modelAndView; // return modelAndView.addObject(map); 
	  }
	 

}
