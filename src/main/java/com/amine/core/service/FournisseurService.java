package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Fournisseur;

public interface FournisseurService {
	
	public Fournisseur readFournisseurById(Long fournisseur);
	public Fournisseur saveFournisseur(Fournisseur fournisseur) throws Exception;
	public void deleteFournisseur(Fournisseur fournisseur);
	public List<Fournisseur> getAllFournisseur();
}
