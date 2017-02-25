package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Fournisseur;

public interface FournisseurDao {

	public Fournisseur readFournisseurById(Long id);
	public Fournisseur updateFournisseur(Fournisseur fournisseur);
	public void delete(Fournisseur fournisseur);
	public Fournisseur creatFournisseur();
	public List<Fournisseur> getAllFournisseur();

}
