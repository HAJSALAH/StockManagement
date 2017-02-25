package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Box;
import com.amine.core.domain.Ouvrier;

public interface OuvrierService {

	public Ouvrier readOuvrierById(Long ouvrier);
	public Ouvrier saveOuvrier(Ouvrier ouvrier) throws Exception;
	public void deleteOuvrier(Ouvrier ouvrier);
	public List<Ouvrier> getAllOuvrier();
}
