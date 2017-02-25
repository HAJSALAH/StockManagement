package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Coordonnees;

public interface CoordonneesService {
	
	public Coordonnees readCoordonneesById(Long coordonnees);
	public Coordonnees saveCoordonnees(Coordonnees coordonnees) throws Exception;
	public void deleteCoordonnees(Coordonnees coordonnees);
	public List<Coordonnees> getAllCoordonnees();

}
