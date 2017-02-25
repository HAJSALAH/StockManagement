package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Facture;
import com.amine.core.domain.FactureImpl;

@Repository("factureDao")
public class FactureDaoImpl implements FactureDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Facture readFactureById(final Long id) {

        return em.find(Facture.class, id);
    }

    @Override
    public Facture updateFacture(final Facture facture) {

        return em.merge(facture);
    }

    @Override
    public void delete(final Facture facture) {

        em.remove(facture);
    }

    @Override
    public Facture creatFacture() {

        return new FactureImpl();
    }

    @Override
    public List<Facture> getAllFacture() {
        final Query q = em.createQuery("select F from Facture F");
        return getAllFacture();
    }

}
