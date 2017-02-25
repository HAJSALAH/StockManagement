package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Facture;

public interface FactureDao {
	public Facture readFactureById(Long id);
	public Facture updateFacture(Facture facture);
	public void delete(Facture facture);
	public Facture creatFacture();
	public List<Facture> getAllFacture();


}
