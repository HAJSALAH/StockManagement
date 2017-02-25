package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.TabDevisDao;
import com.amine.core.domain.TabDevis;

@Service("tabDevisService")
public class TabDevisServiceImpl implements TabDevisService {

    @Resource(name = "tabDevisDao")
    protected TabDevisDao tabDevisDao;

    @Override
    public TabDevis readTabDevisById(final Long tabDevis) {

        return tabDevisDao.readTabDevisById(tabDevis);
    }

    @Override
    @Transactional
    public TabDevis saveTabDevis(final TabDevis tabDevis) throws Exception {
        if (tabDevis == null) {
            throw new NullPointerException("object tabDevis is null");
        }
        return tabDevisDao.updateTabDevis(tabDevis);
    }

    @Override
    @Transactional
    public void deleteTabDevis(final TabDevis tabDevis) {
        tabDevisDao.delete(tabDevis);

    }

    @Override
    public List<TabDevis> getAllTabDevis() {

        return tabDevisDao.getAllTabDevis();
    }

}
