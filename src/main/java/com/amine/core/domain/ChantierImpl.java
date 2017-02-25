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
import javax.persistence.Table;

@Entity
@Table(name = "Chantier")
public class ChantierImpl implements Chantier {

    @Id
    @Column(name = "chantier_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idChantier;

    @ManyToOne(targetEntity = DevisImpl.class)
    private List<Devis> d = new ArrayList<Devis>();

    @ManyToOne(targetEntity = CoordonneesImpl.class)
    @JoinColumn(name = "coordonne_id")
    protected Coordonnees coordonnees;

    @Override
    public Long getIdChantier() {

        return idChantier;
    }

    @Override
    public void setIdChantier(final Long idChantier) {
        this.idChantier = idChantier;

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
    public List<Devis> getDevis() {

        return d;
    }

    @Override
    public void setDevis(final List<Devis> d) {
        this.d = d;

    }

}
