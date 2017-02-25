package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Materiels;
import com.amine.core.domain.MaterielsImpl;

@Repository("materielsDao")
public class MaterielsDaoImpl implements MaterielsDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Materiels readMaterielsById(final Long id) {

        return em.find(Materiels.class, id);
    }

    @Override
    public Materiels updateMateriels(final Materiels materiels) {

        return em.merge(materiels);
    }

    @Override
    public void delete(final Materiels materiels) {
        em.remove(materiels);

    }

    @Override
    public Materiels creatMateriels() {

        return new MaterielsImpl();
    }

    @Override
    public List<Materiels> getAllMateriels() {
        final Query q = em.createQuery("select M from Materiels M");
        return getAllMateriels();
    }

}
