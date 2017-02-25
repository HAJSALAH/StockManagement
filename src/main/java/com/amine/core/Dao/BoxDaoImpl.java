package com.amine.core.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.amine.core.domain.Box;
import com.amine.core.domain.BoxImpl;

@Repository("boxDao")
public class BoxDaoImpl implements BoxDao {

    @PersistenceContext(unitName = "persistence")
    protected EntityManager em;

    @Override
    public Box readBoxById(final Long id) {

        return em.find(Box.class, id);
    }

    @Override
    public Box updateBox(final Box box) {

        return em.merge(box);
    }

    @Override
    public void delete(final Box box) {
        em.remove(box);

    }

    @Override
    public Box creatBox() {

        return new BoxImpl();
    }

    @Override
    public List<Box> getAllBox() {
        final Query q = em.createQuery("select B from Box B");
        return getAllBox();
    }

}
