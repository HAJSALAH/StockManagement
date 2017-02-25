package com.amine.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface Devis {
	
	public TabDevis getTabDevis();
	public void setTabDevis(TabDevis tabDevis);
	
	public Chantier getChantier();
	public void setChantier(Chantier chantier);
	
	public Long getIdDevis();
	public void setIdDevis(Long idDLong);
	
	public String getDescription();
	public void setDescription(String discription);
	
	public String getConditionGenerale();
	public void setConditionGenerale(String ConditionGenerale);
	
	public String getReference();
	public void setReference(String Reference);
	
	public Date getDate() ;
	public void setDate(Date date);
	
	public List<Materiels> getMateriels();
	public void setMateriels(List<Materiels> m);
	
	public List<Facture> f=new ArrayList<Facture>();
	public void setFacture(List<Facture> f);

}
