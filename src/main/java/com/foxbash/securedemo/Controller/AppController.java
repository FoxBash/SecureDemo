package com.foxbash.securedemo.Controller;

import com.foxbash.securedemo.Model.Account;
import com.foxbash.securedemo.Service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AppController {
    private final AccountService service;
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello there");
    }
    @PostMapping("/account")
    public ResponseEntity<Account> addAccount(@RequestBody Account account){
        Account account1 = service.createAccount(account);
        return ResponseEntity.ok(account1);

    }
    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAccounts(){
        List<Account> accounts = service.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }
}
