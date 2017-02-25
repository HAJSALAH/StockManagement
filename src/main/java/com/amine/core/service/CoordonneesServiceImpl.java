package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.CoordonneesDao;
import com.amine.core.domain.Coordonnees;

@Service("coordonneesService")
public class CoordonneesServiceImpl implements CoordonneesService {

    @Resource(name = "coordonneesDao")
    protected CoordonneesDao coordonneesDao;

    @Override
    public Coordonnees readCoordonneesById(final Long coordonnees) {

        return coordonneesDao.readCoordonneesById(coordonnees);
    }

    @Override
    @Transactional
    public Coordonnees saveCoordonnees(final Coordonnees coordonnees) throws Exception {
        if (coordonnees == null) {
            throw new NullPointerException("Object coordonnees is null");
        }

        return coordonneesDao.updateCoordonnees(coordonnees);
    }

    @Override
    @Transactional
    public void deleteCoordonnees(final Coordonnees coordonnees) {
        coordonneesDao.delete(coordonnees);
    }

    @Override
    public List<Coordonnees> getAllCoordonnees() {

        return coordonneesDao.getAllCoordonnees();
    }

}
