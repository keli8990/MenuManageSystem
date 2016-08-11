package com.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.domain.TestMenu;

@Controller
//@RequestMapping("/kfc/brands")
public class MenuTestController {
	private TestMenu m;
	
	public TestMenu getMenu() {
		return m;
	}

	public void setMenu(TestMenu m) {
		this.m = m;
	}

	//@RequestMapping(value="/addtest",method=RequestMethod.POST )
	@RequestMapping(value="/addtest",method=RequestMethod.POST )
	public @ResponseBody String ghopInJSON( @RequestBody TestMenu menu, ServletRequest req, ServletResponse resp, Model model) throws JsonProcessingException {
		HttpServletRequest request = (HttpServletRequest)req;
		//name = request.getParameter("name");
		HttpServletResponse response = (HttpServletResponse) resp;
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
		System.out.println("1324234");
		TestMenu m = new TestMenu();
//		String name = request.getParameter("name");
//		String pwd = request.getParameter("pwd");
//		m.setName(name);
//		m.setPrice(pwd);
		ObjectMapper mapper = new ObjectMapper();  
		System.out.println(menu.getName());
		System.out.println(menu.getPrice());
		model.addAttribute("name",menu.getName());
		model.addAttribute("price",menu.getPrice());
		String Json =  mapper.writeValueAsString(model); 
		return Json;
		
		

	}
	
	
	
	@RequestMapping(value = "saveUser", method = {RequestMethod.POST}) 
    @ResponseBody  
    public String saveUser(@RequestBody List<TestMenu> users, ServletRequest req, ServletResponse resp) { 
		HttpServletRequest request = (HttpServletRequest)req;
		//name = request.getParameter("name");
		HttpServletResponse response = (HttpServletResponse) resp;
//		response.setHeader("Access-Control-Allow-Origin","*");
//		response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
//		response.setHeader("Access-Control-Allow-Methods", "POST");  
//        response.setHeader("Allow", "POST");  
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "POST, PUT, DELETE, OPTIONS"); 
		response.setHeader("Access-Control-Allow-Headers","Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With");
		response.setHeader("Content-Type", "text/html; charset=utf-8");

         System.out.println(users.size());
         return String.valueOf(users.size());
    } 
	
	
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)  
	 public @ResponseBody String order(ServletRequest req, ServletResponse resp, Model model) {  
		HttpServletRequest request = (HttpServletRequest)req;
		//name = request.getParameter("name");
		HttpServletResponse response = (HttpServletResponse) resp;
		
		response.setHeader("Access-Control-Allow-Origin","*");
		response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
		response.setHeader("Access-Control-Allow-Methods", "POST");  
        response.setHeader("Allow", "POST");  
		Map<String,String[]>params = request.getParameterMap();
		String queryString = "";
		for (String key : params.keySet()) {  
            String[] values = params.get(key);  
            for (int i = 0; i < values.length; i++) {  
                String value = values[i];  
                queryString += key + "=" + value + "&";  
            }  
        }  
		queryString = queryString.substring(0, queryString.length() - 1); 
		System.out.println("POST " + request.getRequestURL() + " " + queryString);
			return "123";  
	}  
	
//	 @RequestMapping(value="addjson", method = {RequestMethod.GET })  
//	    @ResponseBody  
//	    public String addUser(@RequestBody List<TestMenu> user,ServletRequest req, ServletResponse resp)  
//	    {   
//		 	HttpServletResponse response = (HttpServletResponse) resp;
////		 	response.setHeader("Access-Control-Allow-Origin","*");
////			response.setHeader("Access-Control-Allow-Headers","Origin, X-Requested-With, Content-Type, Accept");
//			
//			
////		 	System.out.println("Hello");
////		 	
////			//			user.setName(user.getName());
//////			user.setPrice(user.getPrice());
////	        System.out.println(user.get(0).getName() + " " + user.get(0).getPrice()); 
////	        System.out.println("Hello");
//	        //return new HashMap<String, String>().put("success", "true");  
//	        return "123123";
//	    }  
	
}
