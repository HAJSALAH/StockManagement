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
@Table(name = "Coordonnes")
public class CoordonneesImpl implements Coordonnees {

    @Id
    @Column(name = "coordonne_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCoordonnees;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "tel")
    private int tel;
    @Column(name = "mail")
    private String mail;
    @Column(name = "rue")
    private String rue;
    @Column(name = "ville")
    private String ville;
    @Column(name = "codePostale")
    private int codePostale;

    @OneToMany(targetEntity = BoxImpl.class)
    protected List<Box> b = new ArrayList<Box>();

    @OneToMany(targetEntity = ChantierImpl.class)
    protected List<Chantier> c = new ArrayList<Chantier>();

    @Override
    public List<Box> getBox() {
        return b;
    }

    @Override
    public void setBox(final List<Box> b) {
        this.b = b;
    }

    @Override
    public List<Chantier> getChantier() {

        return c;
    }

    @Override
    public void setChantier(final List<Chantier> c) {

        this.c = c;
    }

    @Override
    public String getNom() {

        return nom;
    }

    @Override
    public void setNom(final String nom) {
        this.nom = nom;

    }

    @Override
    public String getPrenom() {

        return prenom;
    }

    @Override
    public void setPrenom(final String prenom) {
        this.prenom = prenom;

    }

    @Override
    public int getTel() {

        return tel;
    }

    @Override
    public void setTel(final int tel) {
        this.tel = tel;

    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(final String mail) {
        this.mail = mail;

    }

    @Override
    public String getRue() {

        return rue;
    }

    @Override
    public void setRue(final String rue) {
        this.rue = rue;

    }

    @Override
    public String getVille() {

        return ville;
    }

    @Override
    public void setVille(final String ville) {
        this.ville = ville;

    }

    @Override
    public int getCodePostale() {

        return codePostale;
    }

    @Override
    public void setCodePostale(final int codePostale) {
        this.codePostale = codePostale;

    }

}
