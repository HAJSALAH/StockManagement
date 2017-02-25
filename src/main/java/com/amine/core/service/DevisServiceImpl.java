package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.DevisDao;
import com.amine.core.domain.Devis;

@Service("devisService")
public class DevisServiceImpl implements DevisService {

    @Resource(name = "devisDao")
    protected DevisDao devisDao;

    @Override
    public Devis readDevisById(final Long devis) {

        return devisDao.readDevisById(devis);
    }

    @Override
    @Transactional
    public Devis saveDevis(final Devis devis) throws Exception {
        if (devis == null) {
            throw new NullPointerException("object devis is not null");

        }
        return devisDao.updateDevis(devis);
    }

    @Override
    @Transactional
    public void deleteDevis(final Devis devis) {
        devisDao.delete(devis);
    }

    @Override
    public List<Devis> getAllDevis() {

        return devisDao.getAllDevis();
    }

}
