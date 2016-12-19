package fr.formation.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.DAO.IngredientDAO;
import fr.formation.ENTITY.Ingredient;

@Service
public class IngredientService {

	@Autowired
	private IngredientDAO dao;

	public List<Ingredient> getAll() {
		return this.dao.findAll();
	}

	
	@Transactional
	public Ingredient create(final Ingredient ingredient) {
		return this.dao.save(ingredient);
	}
}
