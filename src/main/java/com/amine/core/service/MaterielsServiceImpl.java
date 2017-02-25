package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.MaterielsDao;
import com.amine.core.domain.Materiels;

@Service("materielsService")
public class MaterielsServiceImpl implements MaterielsService {

    @Resource(name = "materielsDao")
    protected MaterielsDao materielsDao;

    @Override
    public Materiels readMaterielsById(final Long materiels) {

        return materielsDao.readMaterielsById(materiels);
    }

    @Override
    @Transactional
    public Materiels saveMateriels(final Materiels materiels) throws Exception {
        if (materiels == null) {
            throw new NullPointerException("object materiels is null");
        }
        return materielsDao.updateMateriels(materiels);
    }

    @Override
    @Transactional
    public void deleteMateriels(final Materiels materiels) {

        materielsDao.delete(materiels);
    }

    @Override
    public List<Materiels> getAllMateriels() {

        return materielsDao.getAllMateriels();
    }

}
