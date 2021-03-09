package com.application.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("home")
	// public ModelAndView home(@RequestParam("name") String myName)
	public ModelAndView home(Aliens aliens)
	{
       ModelAndView mv = new ModelAndView();
       mv.addObject("obj", aliens);
       mv.setViewName("home");

		return mv;
	}
}
