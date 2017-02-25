package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Devis;

public interface DevisDao {
	public Devis readDevisById(Long id);
	public Devis updateDevis(Devis devis);
	public void delete(Devis devis);
	public Devis creatDevis( );
	public List<Devis> getAllDevis();


}
