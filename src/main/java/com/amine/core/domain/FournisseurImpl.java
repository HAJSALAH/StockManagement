package com.amine.core.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Fournisseur")
public class FournisseurImpl implements Fournisseur {
    @Id
    @Column(name = "fournisseur_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFournisseur;

    @OneToMany(targetEntity = MaterielsImpl.class)
    protected List<Materiels> m = new ArrayList<Materiels>();

    @Column(name = "matriculeFiscale")
    private String matriculeFiscale;

    @Column(name = "webSite")
    private String webSite;

    @Override
    public Long getIdFournisseur() {

        return idFournisseur;
    }

    @Override
    public void setIdFournisseur(final Long idFournisseur) {

        this.idFournisseur = idFournisseur;
    }

    @Override
    public String getMatriculeFiscale() {

        return matriculeFiscale;
    }

    @Override
    public void setMatriculeFiscale(final String matriculeFiscale) {

        this.matriculeFiscale = matriculeFiscale;
    }

    @Override
    public String getWabSite() {

        return webSite;
    }

    @Override
    public void setWebSite(final String webSite) {

        this.webSite = webSite;
    }

    @Override
    public List<Materiels> getMateriels() {

        return m;
    }

    @Override
    public void setMateriels(final List<Materiels> m) {
        this.m = m;

    }

}
