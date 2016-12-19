package fr.formation.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView getIndex(){
		
		final ModelAndView mav = new ModelAndView();
		final String titre = "Index";
		mav.addObject("titre", titre);
		mav.setViewName("index");
		return mav;
		
	}
	
}
