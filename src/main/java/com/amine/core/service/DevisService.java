package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Devis;

public interface DevisService {
	
	public Devis readDevisById(Long devis);
	public Devis saveDevis(Devis devis) throws Exception;
	public void deleteDevis(Devis devis);
	public List<Devis> getAllDevis();

}
