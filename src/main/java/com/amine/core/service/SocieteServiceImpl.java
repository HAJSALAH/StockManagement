package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.SocieteDao;
import com.amine.core.domain.Societe;

@Service("societeService")
public class SocieteServiceImpl implements SocieteService {

    @Resource(name = "societeDao")
    protected SocieteDao societeDao;

    @Override
    public Societe readSocieteById(final Long societe) {

        return societeDao.readSocieteById(societe);
    }

    @Override
    @Transactional
    public Societe saveSociete(final Societe societe) throws Exception {
        if (societe == null) {
            throw new NullPointerException("object siciete is null");
        }
        return societeDao.updateSociete(societe);
    }

    @Override
    @Transactional
    public void deleteSociete(final Societe societe) {

        societeDao.delete(societe);
    }

    @Override
    public List<Societe> getAllSociete() {

        return societeDao.getAllSociete();
    }

}
