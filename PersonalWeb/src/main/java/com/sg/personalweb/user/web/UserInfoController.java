package com.sg.personalweb.user.web;

import com.sg.personalweb.common.constants.RequestParameterNameConstants;
import com.sg.personalweb.common.domain.result.Result;
import com.sg.personalweb.common.domain.result.ResultGenerator;
import com.sg.personalweb.user.domain.UserInfo;
import com.sg.personalweb.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description controller 用户信息控制器
 * @Author ShGuan
 * @Date 2019/6/12 22:47
 **/
@RestController
@RequestMapping("/user/info")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/")
    public Result<String> saveUserInfo(@RequestBody UserInfo userInfo) {
        return ResultGenerator.genSuccessResult(userInfoService.save(userInfo));
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> removeUserInfoById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(id);
    }

    @PutMapping("/")
    public Result<UserInfo> updateUserInfo(@RequestBody UserInfo userInfo) {
        userInfoService.update(userInfo);
        return ResultGenerator.genSuccessResult(userInfoService.getById(userInfo.getId()));
    }

    @GetMapping("/{id}")
    public Result<UserInfo> getUserInfoById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(userInfoService.getById(id));
    }

}