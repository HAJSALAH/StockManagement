package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;

public interface ChantierDao {
	public Chantier readChantierById(Long id);
	public Chantier updateChantier(Chantier chantier);
	public void delete(Chantier chantier);
	public Chantier creatChantier();
	public List<Chantier> getAllChantier();


}
