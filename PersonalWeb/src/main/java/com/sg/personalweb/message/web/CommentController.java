package com.sg.personalweb.message.web;

import com.sg.personalweb.common.constants.RequestParameterNameConstants;
import com.sg.personalweb.common.domain.result.Result;
import com.sg.personalweb.common.domain.result.ResultGenerator;
import com.sg.personalweb.message.domain.Comment;
import com.sg.personalweb.message.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description controller 评论控制器
 * @Author ShGuan
 * @Date 2019/6/13 0:48
 **/

@RestController
@RequestMapping("/message/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/")
    public Result<String> saveComment(@RequestBody Comment comment) {
        return ResultGenerator.genSuccessResult(commentService.save(comment));
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> removeCommentById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(commentService.removeById(id));
    }

    @PutMapping("/")
    public Result<Comment> updateComment(@RequestBody Comment comment) {
        commentService.update(comment);
        return ResultGenerator.genSuccessResult(commentService.getById(comment.getId()));
    }

    @GetMapping("/{id}")
    public Result<List<Comment>> getCommentById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(commentService.getById(id));
    }
}