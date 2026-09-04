package com.F4.Workaholic.useraccount.controller;

import com.F4.Workaholic.useraccount.entity.UserAccount;
import com.F4.Workaholic.useraccount.service.UserAccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-accounts")
public class UserAccountController {

    private final UserAccountService service;

    public UserAccountController(UserAccountService service) {
        this.service = service;
    }

    @PostMapping
    public UserAccount create(@RequestBody UserAccount userAccount) {
        return service.create(userAccount);
    }

    @GetMapping
    public List<UserAccount> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public UserAccount getById(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public UserAccount update(
            @PathVariable Long id,
            @RequestBody UserAccount userAccount) {

        return service.update(id, userAccount);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}