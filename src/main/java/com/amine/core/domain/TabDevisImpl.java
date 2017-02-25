package com.amine.core.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TabDevis")
public class TabDevisImpl implements TabDevis {
    @Id
    @Column(name = "idTabDevis")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTabDevis;

    @Column(name = "quantite")
    private float quantite;

    @Column(name = "TVA")
    private Double TVA;

    @Column(name = "total")
    private Double total;

    @Column(name = "totalTTC")
    private Double totalTTC;

    @ManyToOne(targetEntity = DevisImpl.class)
    @JoinColumn(name = "devis_id")
    protected Devis devis;

    @Override
    public Long getIdTabDevis() {

        return idTabDevis;
    }

    @Override
    public void setIdTabDevis(final Long idTabDevis) {

        this.idTabDevis = idTabDevis;
    }

    @Override
    public float getQuantite() {

        return quantite;
    }

    @Override
    public void setQuantite(final float quantite) {
        this.quantite = quantite;

    }

    @Override
    public Double getTVA() {

        return TVA;
    }

    @Override
    public void setTVA(final Double TVA) {
        this.TVA = TVA;

    }

    @Override
    public Double getTotal() {

        return total;
    }

    @Override
    public void setTotal(final Double total) {
        this.total = total;

    }

    @Override
    public Double getTotalTTC() {

        return totalTTC;
    }

    @Override
    public void setTotalTTC(final Double totalTTC) {
        this.totalTTC = totalTTC;
    }

    @Override
    public Devis getDevis() {

        return devis;
    }

    @Override
    public void setDevis(final Devis devis) {
        this.devis = devis;
    }

}
