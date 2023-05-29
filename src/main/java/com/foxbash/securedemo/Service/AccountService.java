package com.foxbash.securedemo.Service;

import com.foxbash.securedemo.Model.Account;

import java.util.List;

public interface AccountService {
    Account createAccount(Account account);

    List<Account> getAllAccounts();
}
