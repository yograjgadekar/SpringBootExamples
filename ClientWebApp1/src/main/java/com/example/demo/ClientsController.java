package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientsController {
	@RequestMapping("clients")
	
	public String clients(HttpServletRequest req) {
		
		HttpSession  session = req.getSession();
		
		String cname = req.getParameter("cname"); 
		//System.out.println("The client name is:." + cname);
		session.setAttribute("cname", cname);
		return "clients";
	}

}
