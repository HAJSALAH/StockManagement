package com.amine.core.domain;

public interface Materiels {

    public Long getIdMateriels();

    public void setIdMateriels(Long idMateriels);

    public String getNomMteriels();

    public void setNomMateriels(String nomMateriels);

    public int getCodeMateriels();

    public void setCodeMateriels(int codeMateriels);

    public String getReference();

    public void setReference(String reference);

    public void setDevis(Devis devis);

    public Devis getDevis();

    public Fournisseur getfournisseur();

    public void setFournisseur(Fournisseur fournisseur);

}
