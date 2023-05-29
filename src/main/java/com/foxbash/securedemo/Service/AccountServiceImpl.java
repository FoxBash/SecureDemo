package com.foxbash.securedemo.Service;

import com.foxbash.securedemo.Model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService{
    private final AccountRepository repository;
    @Override
    public Account createAccount(Account account) {
        return repository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return repository.findAll();
    }
}
