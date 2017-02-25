package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Ouvrier;

public interface OuvrierDao {
	public Ouvrier readOuvrierById(Long id);
	public Ouvrier updateOuvrier(Ouvrier ouvrier);
	public void delete(Ouvrier ouvrier);
	public Ouvrier creatOuvrier();
	public List<Ouvrier> getAllOuvrier();

	

}
