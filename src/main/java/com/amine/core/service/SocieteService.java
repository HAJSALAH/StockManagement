package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Societe;

public interface SocieteService {
	
	public Societe readSocieteById(Long societe);
	public Societe saveSociete(Societe societe) throws Exception;
	public void deleteSociete(Societe societe);
	public List<Societe> getAllSociete();
}
