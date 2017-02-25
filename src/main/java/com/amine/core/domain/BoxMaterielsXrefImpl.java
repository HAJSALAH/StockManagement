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
@Table(name = "Box_Materiel_XREF")
public class BoxMaterielsXrefImpl implements BoxMaterielsXref {

    @Id
    @Column(name = "Box_Materiel_XREF_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long idBoxMaterielsXref;

    @ManyToOne(targetEntity = BoxImpl.class)
    @JoinColumn(name = "box_id")
    protected Box box;

    @ManyToOne(targetEntity = MaterielsImpl.class)
    @JoinColumn(name = "materiel_id")
    protected Materiels materiels;

    @Override
    public Box getBox() {
        return box;
    }

    @Override
    public void setBox() {
        this.box = box;

    }

    @Override
    public Materiels getMateriels() {

        return materiels;
    }

    @Override
    public void setMateriels() {
        this.materiels = materiels;

    }

    @Override
    public Long getIdBoxMaterielsXref() {

        return idBoxMaterielsXref;
    }

    @Override
    public void setIdBoxMaterielsXref(final Long idBoxMaterielsXref) {

        this.idBoxMaterielsXref = idBoxMaterielsXref;
    }

}
