package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Devis;
import com.amine.core.domain.DevisImpl;

@Repository("devisDao")
public class DevisDaoImpl implements DevisDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Devis readDevisById(final Long id) {

        return em.find(Devis.class, id);
    }

    @Override
    public Devis updateDevis(final Devis devis) {

        return em.merge(devis);
    }

    @Override
    public void delete(final Devis devis) {

        em.remove(devis);
    }

    @Override
    public Devis creatDevis() {

        return new DevisImpl();
    }

    @Override
    public List<Devis> getAllDevis() {
        final Query q = em.createQuery("select D from Devis D");
        return getAllDevis();
    }

}
