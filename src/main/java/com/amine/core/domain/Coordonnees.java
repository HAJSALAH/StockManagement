package com.amine.core.domain;

import java.util.List;

public interface Coordonnees {
	
	public List<Box> getBox();
	public void setBox(List<Box> b);
	
	public List<Chantier> getChantier();
	public void setChantier(List<Chantier> c);
	
	public String getNom();
	public void setNom(String nom);
	
	public String getPrenom();
	public void setPrenom(String prenom);
	
	public int getTel();
	public void setTel(int tel);
	
	public String getMail();
	public void setMail(String mail);
	
	public String getRue();
	public void setRue(String rue);
	
	public String getVille();
	public void setVille(String ville);
	
	public int getCodePostale();
	public void setCodePostale(int codePostale);
	

}
