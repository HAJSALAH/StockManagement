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
@Table(name = "Societe")
public class SocieteImpl implements Societe {

    @OneToMany(targetEntity = BoxImpl.class)
    protected List<Box> b = new ArrayList<Box>();

    @Id
    @Column(name = "societe_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSociete;

    @Override
    public Long getIdSociete() {

        return idSociete;
    }

    @Override
    public void setIdSiciete(final Long idSociete) {

        this.idSociete = idSociete;
    }

    @Override
    public List<Box> getBox() {
        return b;
    }

    @Override
    public void setBox(final List<Box> b) {
        this.b = b;
    }

}
