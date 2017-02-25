package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Ouvrier;
import com.amine.core.domain.OuvrierImpl;

@Repository("ouvrierDao")
public class OuvrierDaoImpl implements OuvrierDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Ouvrier readOuvrierById(final Long id) {

        return em.find(Ouvrier.class, id);
    }

    @Override
    public Ouvrier updateOuvrier(final Ouvrier ouvrier) {

        return em.merge(ouvrier);
    }

    @Override
    public void delete(final Ouvrier ouvrier) {
        em.remove(ouvrier);

    }

    @Override
    public Ouvrier creatOuvrier() {

        return new OuvrierImpl();
    }

    @Override
    public List<Ouvrier> getAllOuvrier() {
        final Query q = em.createQuery("select O from Ouvrier O");
        return getAllOuvrier();
    }

}
