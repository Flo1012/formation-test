package fr.formation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ENTITY.Cocktail;

@Repository
public interface CocktailDAO extends JpaRepository<Cocktail, Integer>{

}
