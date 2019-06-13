package com.sg.personalweb.common.dao;

import com.sg.personalweb.common.domain.common.basedomain.BaseDomain;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description dao基础接口
 * @Author ShGuan
 * @Date 2019/6/12 21:42
 **/
public interface BaseRepository<T extends BaseDomain> extends JpaRepository<T, String> {

}