package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.FournisseurDao;
import com.amine.core.domain.Fournisseur;

@Service("fournisseurService")
public class FournisseurServiceImpl implements FournisseurService {

    @Resource(name = "fournisseurDao")
    protected FournisseurDao fournisseurDao;

    @Override
    public Fournisseur readFournisseurById(final Long fournisseur) {

        return fournisseurDao.readFournisseurById(fournisseur);
    }

    @Override
    @Transactional
    public Fournisseur saveFournisseur(final Fournisseur fournisseur) throws Exception {
        if (fournisseur == null) {
            throw new NullPointerException("object fournisseur is null ");

        }

        return fournisseurDao.updateFournisseur(fournisseur);
    }

    @Override
    @Transactional
    public void deleteFournisseur(final Fournisseur fournisseur) {
        fournisseurDao.delete(fournisseur);

    }

    @Override
    public List<Fournisseur> getAllFournisseur() {

        return fournisseurDao.getAllFournisseur();
    }

}
