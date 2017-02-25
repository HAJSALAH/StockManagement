package com.amine.core.domain;

public interface TabDevis {

    public Long getIdTabDevis();

    public void setIdTabDevis(Long idTabDevis);

    public float getQuantite();

    public void setQuantite(float quantite);

    public Double getTVA();

    public void setTVA(Double TVA);

    public Double getTotal();

    public void setTotal(Double total);

    public Double getTotalTTC();

    public void setTotalTTC(Double totalTTC);

    public Devis getDevis();

    public void setDevis(Devis devis);

}
