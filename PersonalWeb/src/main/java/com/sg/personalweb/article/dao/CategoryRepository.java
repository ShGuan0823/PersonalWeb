package com.sg.personalweb.article.dao;

import com.sg.personalweb.article.domain.Category;
import com.sg.personalweb.common.dao.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description dao 分类接口
 * @Author ShGuan
 * @Date 2019/6/13 16:57
 **/
@Repository
public interface CategoryRepository extends BaseRepository<Category> {
}
