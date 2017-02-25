package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Societe;

public interface SocieteDao {
	
	public  Societe readSocieteById(Long id);
	public  Societe updateSociete( Societe  societe);
	public void delete( Societe societe);
	public  Societe creatSociete();
	public List<Societe> getAllSociete();

}
