package com.amine.core.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amine.core.Dao.BoxDao;
import com.amine.core.domain.Box;

@Service("boxService")
public class BoxServiceImpl implements BoxService {

    @Resource(name = "boxDao")
    protected BoxDao boxDao;

    @Override
    public Box readBoxById(final Long box) {

        return boxDao.readBoxById(box);
    }

    @Override
    @Transactional
    public Box saveBox(final Box box) throws Exception {
        if (box == null) {
            throw new NullPointerException("object box is null");
        }
        return boxDao.updateBox(box);
    }

    @Override
    @Transactional
    public void deleteBox(final Box box) {
        boxDao.delete(box);
    }

    @Override
    public List<Box> getAllBox() {

        return boxDao.getAllBox();
    }

}
