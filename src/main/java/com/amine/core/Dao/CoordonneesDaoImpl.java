package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Coordonnees;
import com.amine.core.domain.CoordonneesImpl;

@Repository("coordonneesDao")
public class CoordonneesDaoImpl implements CoordonneesDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Coordonnees readCoordonneesById(final Long id) {

        return em.find(Coordonnees.class, id);
    }

    @Override
    public Coordonnees updateCoordonnees(final Coordonnees coordonnees) {

        return em.merge(coordonnees);
    }

    @Override
    public void delete(final Coordonnees coordonnees) {

        em.remove(coordonnees);
    }

    @Override
    public Coordonnees creatCoordonnees() {

        return new CoordonneesImpl();
    }

    @Override
    public List<Coordonnees> getAllCoordonnees() {
        final Query q = em.createQuery("select s from student s");
        return getAllCoordonnees();
    }

}
