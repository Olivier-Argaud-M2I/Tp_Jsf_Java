package fr.m2i.tp_jsf.backed;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
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
	private String username = "";

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

	public Boolean isLog(){
		if(!this.username.equals("admin")){
			return false;
		}
		return true;
	}
}
