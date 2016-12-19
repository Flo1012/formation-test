package fr.formation.SERVICE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.DAO.CocktailDAO;
import fr.formation.ENTITY.Cocktail;

@Service
public class CocktailService {

	@Autowired
	private CocktailDAO dao;

	public List<Cocktail> getAll() {
		return this.dao.findAll();
	}

	
	@Transactional
	public Cocktail create(final Cocktail cocktail) {
		return this.dao.save(cocktail);
	}
}
