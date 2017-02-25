package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Chantier;
import com.amine.core.domain.ChantierImpl;

@Repository("chantierDao")
public class ChantierDaoImpl implements ChantierDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Chantier readChantierById(final Long id) {

        return em.find(Chantier.class, id);
    }

    @Override
    public Chantier updateChantier(final Chantier chantier) {

        return em.merge(chantier);
    }

    @Override
    public void delete(final Chantier chantier) {
        em.remove(chantier);

    }

    @Override
    public Chantier creatChantier() {

        return new ChantierImpl();
    }

    @Override
    public List<Chantier> getAllChantier() {
        final Query q = em.createQuery("select C from Chantier C");
        return getAllChantier();

    }

}
