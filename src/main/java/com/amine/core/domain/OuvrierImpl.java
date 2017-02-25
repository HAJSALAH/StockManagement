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
@Table(name = "Ouvrier")
public class OuvrierImpl implements Ouvrier {
    @Id
    @Column(name = "ouvrier_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idOuvrier;

    @OneToMany(targetEntity = BoxOuvrierXrefImpl.class, mappedBy = "ouvrier")
    protected List<BoxOuvrierXrefImpl> bmXref = new ArrayList<BoxOuvrierXrefImpl>();

    @Override
    public Long getIdOuvrier() {

        return idOuvrier;
    }

    @Override
    public void setIdOuvrier(final Long idOuvrier) {

        this.idOuvrier = idOuvrier;
    }

}
