package com.amine.core.domain;

import java.util.List;

public interface Chantier {
    public Coordonnees getCoordonnees();

    public void setCoordonnees(Coordonnees coordonnees);

    public Long getIdChantier();

    public void setIdChantier(Long id);

    public List<Devis> getDevis();

    public void setDevis(List<Devis> d);

}
