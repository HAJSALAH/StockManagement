package com.amine.core.domain;

import java.util.List;

public interface Fournisseur {

    public Long getIdFournisseur();

    public void setIdFournisseur(Long IdFournisseur);

    public String getMatriculeFiscale();

    public void setMatriculeFiscale(String MatriculeFiscale);

    public String getWabSite();

    public void setWebSite(String WabSite);

    public List<Materiels> getMateriels();

    public void setMateriels(List<Materiels> m);

}
