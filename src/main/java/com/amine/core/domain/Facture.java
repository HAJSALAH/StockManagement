package com.amine.core.domain;

import java.util.Date;

public interface Facture {
	
	public Long getIdFacture();
	public void setIdFacture(Long idFacture);
	
	public int getQuantite();
	public void setQuantite(int quantite);
	
	public String getConditionGenerale();
	public void setConditionGenerale(String ConditionGenerale);
	
	public String getReference();
	public void setReference(String Reference);
	
	public Double getTVA();
	public void setTVA(Double TVA);
	
	public Double getTotale();
	public void setTotale(Double Totale);
	
	public Double getTotaleTTC();
	public void setTotaleTTC(Double TotaleTTC);
	
	public Date getDate();
	public void setDate(Date date);
	
	public Devis getDevis();
	public void setDevis();
	

}
