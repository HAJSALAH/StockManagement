package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.TabDevis;
import com.amine.core.domain.TabDevisImpl;

@Repository("tabDevisDao")
public class TabDevisDaoImpl implements TabDevisDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public TabDevis readTabDevisById(final Long id) {

        return em.find(TabDevis.class, id);
    }

    @Override
    public TabDevis updateTabDevis(final TabDevis tabDevis) {

        return em.merge(tabDevis);
    }

    @Override
    public void delete(final TabDevis tabDevis) {
        em.remove(tabDevis);

    }

    @Override
    public TabDevis creatTabDevis() {

        return new TabDevisImpl();
    }

    @Override
    public List<TabDevis> getAllTabDevis() {
        final Query q = em.createQuery("select T from TabDevis T");
        return getAllTabDevis();
    }

}
