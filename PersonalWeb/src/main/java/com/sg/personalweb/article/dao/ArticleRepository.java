package com.sg.personalweb.article.dao;

import com.sg.personalweb.article.domain.Article;
import com.sg.personalweb.common.dao.BaseRepository;
import com.sg.personalweb.message.domain.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @Description dao 文章接口
 * @Author ShGuan
 * @Date 2019/6/13 1:40
 **/
@Repository
public interface ArticleRepository extends BaseRepository<Article> {

}