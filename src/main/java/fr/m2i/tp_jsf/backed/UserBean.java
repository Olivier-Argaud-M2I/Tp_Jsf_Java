package fr.m2i.tp_jsf.backed;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;



@Named
@SessionScoped
public class UserBean implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	private String nom = "argaud";
	private String prenom = "olivier";

	private String password = "";

	private String username;

	public String getNom() {
		return nom.toUpperCase();
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
