package com.sg.personalweb.user.service.impl;

import com.sg.personalweb.common.service.impl.BaseServiceImpl;
import com.sg.personalweb.user.dao.UserInfoRepository;
import com.sg.personalweb.user.domain.UserInfo;
import com.sg.personalweb.user.service.UserInfoService;
import org.springframework.stereotype.Service;

/**
 * @Description service 用户信息实现
 * @Author ShGuan
 * @Date 2019/6/12 22:45
 **/
@Service
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, UserInfoRepository> implements UserInfoService {

    public UserInfoServiceImpl(UserInfoRepository dao) {
        super(dao);
    }
}