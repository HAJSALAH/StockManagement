package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Coordonnees;

public interface BoxService {
	
	public Box readBoxById(Long box);
	public Box saveBox(Box box) throws Exception;
	public void deleteBox(Box box);
	public List<Box> getAllBox();

	
	

}
