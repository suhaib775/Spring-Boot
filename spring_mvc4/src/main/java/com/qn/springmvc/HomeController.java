package com.qn.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String mainmenu() {
		return "displaymenu";
	}

	@RequestMapping("displayName")
    public String displayName(@RequestParam("studentname") String name,Model model) {
//		String name=@RequestParam("studentname") 
		name="Hello "+name+" Welcome";
		model.addAttribute("mname",name);
    	return "displayname";
    }
}
