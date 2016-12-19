package fr.formation.CONTROLLER;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.ENTITY.Ingredient;
import fr.formation.SERVICE.IngredientService;

@Controller
@RequestMapping("/ingredients")

public class IngredientController {

	@Autowired
	private IngredientService service;

	@RequestMapping
	public ModelAndView list() {
		final ModelAndView mav = new ModelAndView();
		final String titre = "Liste des ingrédients";
		mav.setViewName("ingredients");

		mav.addObject("ingredients", this.service.getAll());
		return mav;
	}

	@RequestMapping("/add")
	public ModelAndView add() {
		final ModelAndView mav = new ModelAndView();
		final String titre = "Ajout d'un ingrédient";
		
		mav.setViewName("addIngredient");
		mav.addObject("ingredients", this.service.getAll());

		return mav;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String newIngredient(final HttpServletRequest request) {

		final String name = request.getParameter("name");
		final Integer state = Integer.parseInt(request.getParameter("state"));
		// ----> ajout @Transactional dans IngredientService.java
		this.service.create(new Ingredient(name, state)); 
		return "redirect:/ingredients/add.html";
	}

	@RequestMapping(value = "/add2", method = RequestMethod.POST)
	public String newIngredient(@RequestParam final String name, @RequestParam final Integer state ) {

		// ----> ajout @Transactional dans IngredientService.java

		this.service.create(new Ingredient(name , state)); 
		return "redirect:/ingredients/add.html";
	}

}
