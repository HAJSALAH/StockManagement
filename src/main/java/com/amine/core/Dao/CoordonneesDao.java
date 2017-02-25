package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Coordonnees;


public interface CoordonneesDao {
	
	public Coordonnees readCoordonneesById(Long id);
	public Coordonnees updateCoordonnees(Coordonnees coordonnees);
	public void delete(Coordonnees coordonnees);
	public Coordonnees creatCoordonnees( );
	public List<Coordonnees> getAllCoordonnees();

}
