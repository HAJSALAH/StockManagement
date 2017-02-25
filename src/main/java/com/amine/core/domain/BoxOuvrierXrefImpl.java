package com.amine.core.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Box_Ouvrier_XREF")
public class BoxOuvrierXrefImpl implements BoxOuvrierXref {

    @Id
    @Column(name = "Box_Ouvrier_XREF_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBoxOuvrierXref;

    @ManyToOne(targetEntity = BoxImpl.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "box_id")
    protected Box box;

    @ManyToOne(targetEntity = OuvrierImpl.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ouvrier_id")
    protected Ouvrier ouvrier;

    @Override
    public Long getIdBoxOuvrierXref() {

        return idBoxOuvrierXref;
    }

    @Override
    public void setIdBoxOuvrierXref(final Long idBoxOuvrierXref) {

        this.idBoxOuvrierXref = idBoxOuvrierXref;
    }

    @Override
    public Box getBox() {

        return box;
    }

    @Override
    public void setBox(Box box) {
        this.box = box;

    }

    @Override
    public Ouvrier getOuvrier() {

        return ouvrier;
    }

    @Override
    public void setOuvrier(Ouvrier ouvrier) {

        this.ouvrier = ouvrier;
    }

}
