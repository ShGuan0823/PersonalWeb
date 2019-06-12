package com.sg.personalweb.common.service.impl;

import com.sg.personalweb.common.dao.BaseRepository;
import com.sg.personalweb.common.domain.BaseDomain;
import com.sg.personalweb.common.service.BaseService;
import com.sg.personalweb.common.util.Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @Description service基类实现
 * @Author ShGuan
 * @Date 2019/6/12 21:58
 **/
public class BaseServiceImpl<T extends BaseDomain, M extends BaseRepository> implements BaseService<T> {

    private M dao;

    public BaseServiceImpl(M dao) {
        this.dao = dao;
    }

    @Override
    public String save(T t) {
        t.preSave();
        dao.save(t);
        return t.getId();
    }

    @Override
    public Boolean removeById(String id) {
        dao.deleteById(id);
        return true;
    }

    @Override
    public Boolean removeByIds(List<String> ids, Class<T> clazz) throws InstantiationException, IllegalAccessException {
        List<T> entities = new ArrayList<>();
        if (Tools.isNotEmpty(ids)) {
            for (String id : ids) {
                T entity = clazz.newInstance();
                entity.setId(id);
                entities.add(entity);
            }
            dao.deleteAll(entities);
        }
        return true;
    }

    @Override
    public Boolean update(T t) {
        t.preUpdate();
        dao.save(t);
        return true;
    }

    @Override
    public T getById(String id) {
        try {
            return (T) dao.findById(id).get();
        } catch (NoSuchElementException noSuchElementException) {
            return null;
        }
    }

    @Override
    public List<T> list() {
        return dao.findAll();
    }

    @Override
    public Iterable<T> listByIds(List<String> ids) {
        return dao.findAllById(ids);
    }

}