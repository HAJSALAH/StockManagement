package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Materiels;

public interface MaterielsService {
	
	public Materiels readMaterielsById(Long materiels);
	public Materiels saveMateriels(Materiels materiels) throws Exception;
	public void deleteMateriels(Materiels materiels);
	public List<Materiels> getAllMateriels();
}
