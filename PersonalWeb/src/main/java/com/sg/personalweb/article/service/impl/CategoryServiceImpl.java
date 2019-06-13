package com.sg.personalweb.article.service.impl;

import com.sg.personalweb.article.dao.CategoryRepository;
import com.sg.personalweb.article.domain.Category;
import com.sg.personalweb.article.service.CategoryService;
import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description service 分类实现
 * @Author ShGuan
 * @Date 2019/6/13 17:00
 **/
@Service
public class CategoryServiceImpl extends BaseServiceImpl<Category, CategoryRepository> implements CategoryService{

    public CategoryServiceImpl(CategoryRepository dao) {
        super(dao);
    }
}