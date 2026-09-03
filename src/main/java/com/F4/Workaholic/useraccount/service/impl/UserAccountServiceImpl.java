package com.F4.Workaholic.useraccount.service.impl;

import com.F4.Workaholic.useraccount.entity.UserAccount;
import com.F4.Workaholic.useraccount.repository.UserAccountRepository;
import com.F4.Workaholic.useraccount.service.UserAccountService;
import com.corebackend.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl
        extends BaseServiceImpl<UserAccount>
        implements UserAccountService {

    public UserAccountServiceImpl(UserAccountRepository repository) {
        super(repository);
    }
}