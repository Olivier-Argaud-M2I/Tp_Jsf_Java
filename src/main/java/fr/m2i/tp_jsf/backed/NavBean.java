package fr.m2i.tp_jsf.backed;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@Named
@RequestScoped
public class NavBean implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	
	
	public String index() {
		return "index?faces-redirect=true";
	}

	public String about() {
		return "about?faces-redirect=true";
	}

	public String login() {
		return "login?faces-redirect=true";
	}
}
