package com.F4.Workaholic.useraccount.controller;

import com.F4.Workaholic.useraccount.entity.UserAccount;
import com.F4.Workaholic.useraccount.service.UserAccountService;
import com.corebackend.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-accounts")
public class UserAccountController
        extends BaseController<UserAccount> {

    public UserAccountController(UserAccountService service) {
        super(service);
    }
}