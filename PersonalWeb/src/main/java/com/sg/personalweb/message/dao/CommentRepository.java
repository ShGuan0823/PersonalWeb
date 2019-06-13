package com.sg.personalweb.message.dao;

import com.sg.personalweb.common.dao.BaseRepository;
import com.sg.personalweb.message.domain.Comment;
import org.springframework.stereotype.Repository;

/**
 * @Description dao 评论接口
 * @Author ShGuan
 * @Date 2019/6/13 0:42
 **/
@Repository
public interface CommentRepository extends BaseRepository<Comment> {

}
