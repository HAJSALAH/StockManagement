package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.TabDevis;

public interface TabDevisService {
	
	public TabDevis readTabDevisById(Long tabDevis);
	public TabDevis saveTabDevis(TabDevis tabDevis) throws Exception;
	public void deleteTabDevis(TabDevis tabDevis);
	public List<TabDevis> getAllTabDevis();
}
