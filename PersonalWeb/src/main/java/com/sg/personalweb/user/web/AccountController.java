package com.sg.personalweb.user.web;

import com.sg.personalweb.common.constants.RequestParameterNameConstants;
import com.sg.personalweb.common.domain.result.Result;
import com.sg.personalweb.common.domain.result.ResultGenerator;
import com.sg.personalweb.user.domain.Account;
import com.sg.personalweb.user.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description controller 帐号控制器
 * @Author ShGuan
 * @Date 2019/6/12 22:32
 **/
@RestController
@RequestMapping("/user/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/")
    public Result<String> saveAccount(@RequestBody Account account) {
        return ResultGenerator.genSuccessResult(accountService.save(account));
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> removeAccountById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(accountService.removeById(id));
    }

    @PutMapping("/")
    public Result<Account> updateAccount(@RequestBody Account account) {
        accountService.update(account);
        return ResultGenerator.genSuccessResult(account);
    }

    @GetMapping("/{id}")
    public Result<Account> getAccountById(@PathVariable(name = RequestParameterNameConstants.ID) String id) {
        return ResultGenerator.genSuccessResult(accountService.getById(id));
    }

}