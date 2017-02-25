package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Fournisseur;
import com.amine.core.domain.FournisseurImpl;

@Repository("fournisseurDao")
public class FournisseurDaoImpl implements FournisseurDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Fournisseur readFournisseurById(final Long id) {

        return em.find(Fournisseur.class, id);
    }

    @Override
    public Fournisseur updateFournisseur(final Fournisseur fournisseur) {

        return em.merge(fournisseur);
    }

    @Override
    public void delete(final Fournisseur fournisseur) {

        em.remove(fournisseur);
    }

    @Override
    public Fournisseur creatFournisseur() {

        return new FournisseurImpl();
    }

    @Override
    public List<Fournisseur> getAllFournisseur() {
        final Query q = em.createQuery("select F from Fournisseur F");
        return getAllFournisseur();
    }

}
