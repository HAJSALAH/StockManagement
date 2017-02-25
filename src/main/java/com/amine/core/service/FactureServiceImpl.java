package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.FactureDao;
import com.amine.core.domain.Facture;

@Service("factureService")
public class FactureServiceImpl implements FactureService {

    @Resource(name = "factureDao")
    protected FactureDao factureDao;

    @Override
    public Facture readFactureById(final Long facture) {

        return factureDao.readFactureById(facture);
    }

    @Override
    @Transactional
    public Facture saveFacture(final Facture facture) throws Exception {

        if (facture == null) {
            throw new NullPointerException("opject Facture is  null");
        }

        return factureDao.updateFacture(facture);
    }

    @Override
    @Transactional
    public void deleteFacture(final Facture facture) {
        factureDao.delete(facture);
    }

    @Override
    public List<Facture> getAllFacture() {

        return factureDao.getAllFacture();
    }

}
