package com.shari.newpro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController
{	
@RequestMapping(value="/Home")
public ModelAndView myHome()
{
	ModelAndView model = new ModelAndView();
	model.setViewName("Home");
	return model;
}
}
