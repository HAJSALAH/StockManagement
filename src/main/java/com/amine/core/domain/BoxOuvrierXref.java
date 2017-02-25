package com.amine.core.domain;

public interface BoxOuvrierXref {
	
	public Long getIdBoxOuvrierXref();
	public void setIdBoxOuvrierXref(Long idBoxOuvrierXref);
	
	
	public Box getBox();
	public void setBox(Box box);
	
	public Ouvrier getOuvrier();
	public void setOuvrier(Ouvrier ouvrier);

}
