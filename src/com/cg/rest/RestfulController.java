package com.cg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestfulController {

	@Value("message")
	private String staticValue;
	
	@Value("${property.static.value1}")
	private String staticValue1;
	
	@Value("${list.values}")
	private List<String> list;
	
	@RequestMapping(value="/getStudent", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody Student sample() {
		
		return new Student("sandeep", 23, "Playing Cricket");
	}
	
	@RequestMapping(value="/getStaticValue", method=RequestMethod.GET, produces="application/text")
	public @ResponseBody String sample2() {
		
		return staticValue1;
	}
	
	@RequestMapping(value="/getList", method=RequestMethod.GET)
	public @ResponseBody List<String> getList() {
		
		return list;
	}
	
}
