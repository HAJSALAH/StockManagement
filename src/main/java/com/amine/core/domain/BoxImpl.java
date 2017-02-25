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
@Table(name = "Box")
public class BoxImpl implements Box {

    @Id
    @Column(name = "box_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBox;

    @ManyToOne(targetEntity = CoordonneesImpl.class)
    @JoinColumn(name = "coordonne_id")
    protected Coordonnees coordonnees;

    @ManyToOne(targetEntity = SocieteImpl.class)
    @JoinColumn(name = "societe_id")
    protected Societe societe;

    @OneToMany(targetEntity = BoxMaterielsXrefImpl.class, mappedBy = "box")
    protected List<BoxMaterielsXref> bmXref = new ArrayList<BoxMaterielsXref>();

    @OneToMany(targetEntity = BoxOuvrierXrefImpl.class, mappedBy = "box")
    protected List<BoxOuvrierXref> boXref = new ArrayList<BoxOuvrierXref>();

    @Override
    public Long getIdBox() {

        return idBox;
    }

    @Override
    public void setIdBox(final Long idBox) {
        this.idBox = idBox;

    }

    @Override
    public Coordonnees getCoordonnees() {

        return coordonnees;
    }

    @Override
    public void setCoordonnees(final Coordonnees coordonnees) {
        this.coordonnees = coordonnees;

    }

    @Override
    public Societe getSociete() {
        return societe;
    }

    @Override
    public void setSociete(final Societe societe) {
        this.societe = societe;

    }

    @Override
    public List<BoxMaterielsXref> getBoxMaterielsXrefs() {

        return bmXref;
    }

    @Override
    public void setBoxMateriels(final List<BoxMaterielsXref> bmXref) {
        this.bmXref = bmXref;
    }

    @Override
    public List<BoxOuvrierXref> getBoxOuvrierXref() {

        return boXref;
    }

    @Override
    public void setBoxOuvrierXref(final List<BoxOuvrierXref> boXref) {
        this.boXref = boXref;

    }

}
