package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Facture;

public interface FactureService {
	
	public Facture readFactureById(Long facture);
	public Facture saveFacture(Facture facture) throws Exception;
	public void deleteFacture(Facture facture);
	public List<Facture> getAllFacture();
}
