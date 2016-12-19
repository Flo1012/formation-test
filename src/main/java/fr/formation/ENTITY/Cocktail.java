package fr.formation.ENTITY;

import java.io.Serializable;

public class Cocktail implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String nom;
	private double prix;
	private byte alcoolise;

	public Cocktail(){}

	public Cocktail( String nom, double prix, byte alcoolise) {
		
		this.nom = nom;
		this.prix = prix;
		this.alcoolise = alcoolise;
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

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public byte getAlcoolise() {
		return alcoolise;
	}

	public void setAlcoolise(byte alcoolise) {
		this.alcoolise = alcoolise;
	}

	
}
