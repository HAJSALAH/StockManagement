package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.ChantierDao;
import com.amine.core.domain.Chantier;

@Service("chantierService")
public class ChantierServiceImpl implements ChantierService {

    @Resource(name = "chantierDao")
    protected ChantierDao chantierDao;

    @Override
    public Chantier readChantierById(final Long chantier) {

        return chantierDao.readChantierById(chantier);
    }

    @Override
    @Transactional
    public Chantier saveChantier(final Chantier chantier) throws Exception {
        if (chantier == null) {
            throw new NullPointerException("Object chantier is null ");
        }

        return chantierDao.updateChantier(chantier);
    }

    @Override
    @Transactional
    public void deleteChantier(final Chantier chantier) {

        chantierDao.delete(chantier);
    }

    @Override
    public List<Chantier> getAllChantier() {
        return chantierDao.getAllChantier();
    }

}
