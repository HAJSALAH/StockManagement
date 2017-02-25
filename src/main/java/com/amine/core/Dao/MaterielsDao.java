package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.Materiels;

public interface MaterielsDao {

	public Materiels readMaterielsById(Long id);
	public Materiels updateMateriels(Materiels materiels);
	public void delete(Materiels materiels);
	public Materiels creatMateriels();
	public List<Materiels> getAllMateriels();

}
