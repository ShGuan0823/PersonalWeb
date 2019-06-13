package com.sg.personalweb.article.web;

import com.sg.personalweb.article.domain.Article;
import com.sg.personalweb.article.service.ArticleService;
import com.sg.personalweb.common.constants.RequestParameterNameConstants;
import com.sg.personalweb.common.domain.result.Result;
import com.sg.personalweb.common.domain.result.ResultGenerator;
import com.sg.personalweb.message.domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description controller 文章控制器
 * @Author ShGuan
 * @Date 2019/6/13 1:43
 **/

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @PostMapping("/")
    public Result<String> saveArticle(@RequestBody Article article) {
        return ResultGenerator.genSuccessResult(articleService.save(article));
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> removeArticleById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(articleService.removeById(id));
    }

    @PutMapping("/")
    public Result<Article> updateArticle(@RequestBody Article article) {
        articleService.update(article);
        return ResultGenerator.genSuccessResult(articleService.getById(article.getId()));
    }

    @GetMapping("/{id}")
    public Result<Article> getArticleById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(articleService.getById(id));
    }

//    @PostMapping("/{articleId}/comment")
//    public Result<List<Comment>> getCommentByArticleId(@PathVariable(name = RequestParameterNameConstants.ARTICLE_ID) String articleId) {
//        return ResultGenerator.genSuccessResult();
//    }

}