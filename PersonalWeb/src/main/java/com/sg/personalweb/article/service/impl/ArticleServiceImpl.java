package com.sg.personalweb.article.service.impl;

import com.sg.personalweb.article.dao.ArticleRepository;
import com.sg.personalweb.article.domain.Article;
import com.sg.personalweb.article.service.ArticleService;
import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description service 文章实现
 * @Author ShGuan
 * @Date 2019/6/13 1:41
 **/
@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article, ArticleRepository> implements ArticleService{

    public ArticleServiceImpl(ArticleRepository dao) {
        super(dao);
    }
}