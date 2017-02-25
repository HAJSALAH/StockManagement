package com.amine.core.service;

import java.util.List;

import com.amine.core.domain.Chantier;

public interface ChantierService {

    public Chantier readChantierById(Long chantier);

    public Chantier saveChantier(Chantier chantier) throws Exception;

    public void deleteChantier(Chantier chantier);

    public List<Chantier> getAllChantier();
}
