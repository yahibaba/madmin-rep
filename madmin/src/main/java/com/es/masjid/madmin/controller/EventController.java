package com.es.masjid.madmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {
	
	@RequestMapping(value={"/event", "event"}, method=RequestMethod.GET)
	public ModelAndView index() {
		System.out.println();
		return new ModelAndView("event");
	}		

}
