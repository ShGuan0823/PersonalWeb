package com.sg.personalweb.message.service.impl;

import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import com.sg.personalweb.message.dao.CommentRepository;
import com.sg.personalweb.message.domain.Comment;
import com.sg.personalweb.message.service.CommentService;
import org.springframework.stereotype.Service;

/**
 * @Description service 评论实现
 * @Author ShGuan
 * @Date 2019/6/13 0:45
 **/
@Service
public class CommentServiceImpl extends BaseServiceImpl<Comment, CommentRepository> implements CommentService{

    public CommentServiceImpl(CommentRepository dao) {
        super(dao);
    }
}