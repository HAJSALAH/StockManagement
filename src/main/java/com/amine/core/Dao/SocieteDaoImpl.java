package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Societe;
import com.amine.core.domain.SocieteImpl;

@Repository("societeDao")
public class SocieteDaoImpl implements SocieteDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Societe readSocieteById(final Long id) {

        return em.find(Societe.class, id);
    }

    @Override
    public Societe updateSociete(final Societe societe) {

        return em.merge(societe);
    }

    @Override
    public void delete(final Societe societe) {
        em.remove(societe);

    }

    @Override
    public Societe creatSociete() {

        return new SocieteImpl();
    }

    @Override
    public List<Societe> getAllSociete() {
        final Query q = em.createQuery("select S from Societe S");
        return getAllSociete();
    }

}
