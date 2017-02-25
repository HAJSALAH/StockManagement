package com.amine.core.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Facture")
public class FactureImpl implements Facture {
    @Id
    @Column(name = "Facture_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFacture;

    @Column(name = "quantite")
    private int quantite;

    @Column(name = "conditionGenerale")
    private String conditionGenerale;

    @Column(name = "reference")
    private String reference;

    @Column(name = "TVA")
    private Double TVA;

    @Column(name = "Totale")
    private Double Totale;

    @Column(name = "TotaleTTC")
    private Double TotaleTTC;

    @Column(name = "date")
    private Date date;

    @ManyToOne(targetEntity = DevisImpl.class)
    @JoinColumn(name = "devis_id")
    protected Devis devis;

    @Override
    public Long getIdFacture() {

        return idFacture;
    }

    @Override
    public void setIdFacture(final Long idFacture) {

        this.idFacture = idFacture;
    }

    @Override
    public int getQuantite() {

        return quantite;
    }

    @Override
    public void setQuantite(final int quantite) {

        this.quantite = quantite;
    }

    @Override
    public String getConditionGenerale() {

        return conditionGenerale;
    }

    @Override
    public void setConditionGenerale(final String ConditionGenerale) {

        this.conditionGenerale = conditionGenerale;
    }

    @Override
    public String getReference() {

        return reference;
    }

    @Override
    public void setReference(final String reference) {

        this.reference = reference;
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
    public Double getTotale() {

        return Totale;
    }

    @Override
    public void setTotale(final Double Totale) {

        this.Totale = Totale;
    }

    @Override
    public Double getTotaleTTC() {

        return TotaleTTC;
    }

    @Override
    public void setTotaleTTC(final Double TotaleTTC) {

        this.TotaleTTC = TotaleTTC;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(final Date date) {

        this.date = date;
    }

    @Override
    public Devis getDevis() {

        return devis;
    }

    @Override
    public void setDevis() {
        this.devis = devis;
    }

}
