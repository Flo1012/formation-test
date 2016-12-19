package fr.formation.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.formation.ENTITY.Ingredient;

@Repository
public interface IngredientDAO extends JpaRepository<Ingredient, Integer>{

}
