package com.amine.core.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Materiel")
public class MaterielsImpl implements Materiels {

    @Id
    @Column(name = "materiel_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMateriels;

    @Column(name = "nomMateriels")
    private String nomMateriels;

    @Column(name = "codeMateriels")
    private int codeMateriels;

    @Column(name = "reference")
    private String reference;

    @ManyToOne(targetEntity = DevisImpl.class)
    @JoinColumn(name = "devis_id")
    protected Devis devis;

    @OneToMany(targetEntity = BoxMaterielsXrefImpl.class, mappedBy = "materiels")
    protected List<BoxMaterielsXref> bmXref = new ArrayList<BoxMaterielsXref>();

    @ManyToOne(targetEntity = FournisseurImpl.class)
    @JoinColumn(name = "fournisseur_id")
    protected Fournisseur fournisseur;

    @Override
    public Long getIdMateriels() {

        return idMateriels;
    }

    @Override
    public void setIdMateriels(final Long idMateriels) {

        this.idMateriels = idMateriels;
    }

    @Override
    public String getNomMteriels() {

        return nomMateriels;
    }

    @Override
    public void setNomMateriels(final String nomMateriels) {

        this.nomMateriels = nomMateriels;
    }

    @Override
    public int getCodeMateriels() {

        return codeMateriels;
    }

    @Override
    public void setCodeMateriels(final int codeMateriels) {

        this.codeMateriels = codeMateriels;
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
    public Devis getDevis() {
        return devis;
    }

    @Override
    public void setDevis(final Devis devis) {
        this.devis = devis;

    }

    @Override
    public Fournisseur getfournisseur() {

        return fournisseur;
    }

    @Override
    public void setFournisseur(final Fournisseur fournisseur) {
        this.fournisseur = fournisseur;

    }

}
