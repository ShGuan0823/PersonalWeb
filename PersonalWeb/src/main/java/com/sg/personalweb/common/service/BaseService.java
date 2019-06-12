package com.sg.personalweb.common.service;

import com.sg.personalweb.common.domain.BaseDomain;

import java.util.List;

/**
 * @Description service基类接口
 * @Author ShGuan
 * @Date 2019/6/12 21:57
 **/
public interface BaseService<T extends BaseDomain> {

    /**
     * 添加记录
     * @param t 添加信息
     * @return String 返回值
     */
    String save(T t);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    Boolean removeById(String id);

    /**
     * 根据ids进行批量删除记录
     * @param ids
     * @param clazz
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @return
     */
    Boolean removeByIds(List<String> ids, Class<T> clazz) throws InstantiationException, IllegalAccessException;

    /**
     * 修改记录
     * @param t 需要修改信息
     * @return int 返回值
     */
    Boolean update(T t);

    /**
     * 主键获取记录
     * @param id 主键
     * @return T 记录
     */
    T getById(String id);

    /**
     * 查询所有信息
     * @return List<T> 记录集
     */
    List<T> list();

    /**
     * 根据ids查询
     * @param ids
     * @return
     */
    Iterable<T> listByIds(List<String> ids);
}
