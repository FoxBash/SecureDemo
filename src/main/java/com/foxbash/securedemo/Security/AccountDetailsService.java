package com.foxbash.securedemo.Security;

import com.foxbash.securedemo.Model.Account;
import com.foxbash.securedemo.Service.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Repository
public class AccountDetailsService implements UserDetailsService {
    private final AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Account account = accountRepository.findAccountByEmail(email);
        if (account == null){

            throw new UsernameNotFoundException("Account not found");
        }
        return new AccountUserDetails(account);
    }
}
