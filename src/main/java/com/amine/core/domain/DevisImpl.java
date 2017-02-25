package com.amine.core.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Devis")
public class DevisImpl implements Devis {

    @Id
    @Column(name = "devis_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDevis;

    @Column(name = "description")
    private String description;

    @Column(name = "conditionGenerale")
    private String conditionGenerale;

    @Column(name = "reference")
    private String reference;

    @Column(name = "date")
    private Date date;

    @OneToOne(targetEntity = TabDevisImpl.class)
    @JoinColumn(name = "idTabDevis")
    protected TabDevis tabDevis;

    @ManyToOne(targetEntity = ChantierImpl.class)
    @JoinColumn(name = "chantier_id")
    protected Chantier chantier;

    @OneToMany(targetEntity = MaterielsImpl.class)
    protected List<Materiels> m = new ArrayList<Materiels>();

    @OneToMany(targetEntity = FactureImpl.class)
    protected List<Facture> f = new ArrayList<Facture>();

    @Override
    public Long getIdDevis() {

        return idDevis;
    }

    @Override
    public void setIdDevis(final Long idDevis) {

        this.idDevis = idDevis;
    }

    @Override
    public String getDescription() {

        return description;
    }

    @Override
    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String getConditionGenerale() {

        return conditionGenerale;
    }

    @Override
    public void setConditionGenerale(final String conditionGenerale) {
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
    public Chantier getChantier() {

        return chantier;
    }

    @Override
    public void setChantier(final Chantier chantier) {

        this.chantier = chantier;
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
    public TabDevis getTabDevis() {

        return tabDevis;
    }

    @Override
    public void setTabDevis(final TabDevis tabDevis) {
        this.tabDevis = tabDevis;

    }

    @Override
    public List<Materiels> getMateriels() {
        return m;
    }

    @Override
    public void setMateriels(final List<Materiels> m) {
        this.m = m;
    }

    public List<Facture> getFacture() {
        return f;
    }

    @Override
    public void setFacture(final List<Facture> f) {
        this.f = f;

    }

}
