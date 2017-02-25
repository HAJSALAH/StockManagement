package com.amine.core.Dao;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Chantier;
import com.amine.core.domain.TabDevis;

public interface TabDevisDao {
	public TabDevis readTabDevisById(Long id);
	public TabDevis updateTabDevis(TabDevis tabDevis);
	public void delete(TabDevis tabDevis);
	public TabDevis creatTabDevis();
	public List<TabDevis> getAllTabDevis();

}
