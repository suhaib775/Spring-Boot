package com.qn.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String mainmenu() {
		return "displaymenu";
	}

	@RequestMapping("displayName")
    public String displayName(HttpServletRequest request,Model model) {
		String name=request.getParameter("studentname");
		name=name.toUpperCase();
		model.addAttribute("mname",name);
    	return "displayname";
    }
}
