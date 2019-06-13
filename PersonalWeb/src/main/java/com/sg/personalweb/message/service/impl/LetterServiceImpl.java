package com.sg.personalweb.message.service.impl;

import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import com.sg.personalweb.message.dao.LetterRepository;
import com.sg.personalweb.message.domain.Letter;
import com.sg.personalweb.message.service.LetterService;
import org.springframework.stereotype.Service;

/**
 * @Description service 私信实现
 * @Author ShGuan
 * @Date 2019/6/13 0:52
 **/
@Service
public class LetterServiceImpl extends BaseServiceImpl<Letter, LetterRepository> implements LetterService{

    public LetterServiceImpl(LetterRepository dao) {
        super(dao);
    }
}