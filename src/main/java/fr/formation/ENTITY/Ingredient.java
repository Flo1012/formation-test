package fr.formation.ENTITY;

import java.io.Serializable;

public class Ingredient implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nom;
	private int etat;

	public Ingredient() {

	}

	public Ingredient(String nom, int etat) {
		this.nom = nom;
		this.etat = etat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

}
