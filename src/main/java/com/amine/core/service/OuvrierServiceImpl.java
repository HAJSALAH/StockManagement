package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.OuvrierDao;
import com.amine.core.domain.Ouvrier;

@Service("ouvrierService")
public class OuvrierServiceImpl implements OuvrierService {

    @Resource(name = "ouvrierDao")
    protected OuvrierDao ouvrierDao;

    @Override
    public Ouvrier readOuvrierById(final Long ouvrier) {

        return ouvrierDao.readOuvrierById(ouvrier);
    }

    @Override
    @Transactional
    public Ouvrier saveOuvrier(final Ouvrier ouvrier) throws Exception {
        if (ouvrier == null) {
            throw new NullPointerException("object ouvrier is null");
        }
        return ouvrierDao.updateOuvrier(ouvrier);
    }

    @Override
    @Transactional
    public void deleteOuvrier(final Ouvrier ouvrier) {
        ouvrierDao.delete(ouvrier);
    }

    @Override
    public List<Ouvrier> getAllOuvrier() {

        return ouvrierDao.getAllOuvrier();
    }

}
