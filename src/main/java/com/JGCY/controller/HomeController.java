package com.JGCY.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.JGCY.domain.testDTO;
import com.JGCY.mapper.TimeMapper;
import com.JGCY.testService.testService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

/**
 * Handles requests for the application home page.
 */
@Controller
@AllArgsConstructor //모든 필드를 파라미터로 가지는 생성자를 만든다.
public class HomeController {
	
	
	private testService service; 
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping(value="about",method=RequestMethod.GET)
	public String about(Locale locale, Model model,testDTO dtos) {
		logger.info("Welcome about! The client locale is {}.", locale);
		
		service.write(dtos);
		
		logger.info("insert data");
		logger.info(""+dtos);
		
		return "about";
	}
	
	@RequestMapping(value="ex02List",method=RequestMethod.GET)
	public String ex02List(Model model) {
		
		model.addAttribute("servertime",new java.util.Date());
		
		return "home";
		
	}
	
	@RequestMapping(value = "vote", method = RequestMethod.GET)
	public String vote(HttpServletRequest request, Model model ) {
		System.out.println("vote");
		
		model.addAttribute("request", request);
		
		
		
		return "vote";
	}
}
