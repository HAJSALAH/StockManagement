package com.amine.core.domain;

import java.util.List;

public interface Box {
	
	public Long getIdBox();
	public void setIdBox(Long idBox);
	
	public Coordonnees getCoordonnees();
	public void setCoordonnees(Coordonnees coordonnees);
	
	public Societe getSociete();
	public void setSociete(Societe Societe);
	
	public List<BoxMaterielsXref> getBoxMaterielsXrefs();
	public void setBoxMateriels(List<BoxMaterielsXref> bmXref);
	
	public List<BoxOuvrierXref> getBoxOuvrierXref();
	public void setBoxOuvrierXref(List<BoxOuvrierXref> boXref);

	
	

}
