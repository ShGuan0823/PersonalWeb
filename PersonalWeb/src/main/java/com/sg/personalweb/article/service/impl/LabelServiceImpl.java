package com.sg.personalweb.article.service.impl;

import com.sg.personalweb.article.dao.LabelRepository;
import com.sg.personalweb.article.domain.Label;
import com.sg.personalweb.article.service.LabelService;
import com.sg.personalweb.common.service.impl.BaseServiceImpl;

/**
 * @Description service 标签实现
 * @Author ShGuan
 * @Date 2019/6/13 18:06
 **/
public class LabelServiceImpl extends BaseServiceImpl<Label, LabelRepository> implements LabelService{

    public LabelServiceImpl(LabelRepository dao) {
        super(dao);
    }
}