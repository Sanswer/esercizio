package com.fabrick.esercizio.controller;

import com.fabrick.esercizio.model.Account;
//import com.fabrick.esercizio.repository.AccountRepository;
import com.fabrick.esercizio.model.AccountSaldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class AccountController {

  //   @Autowired
   // AccountRepository accountRepository;

    @Value("${api.key")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

     @GetMapping("/saldo")
    public AccountSaldo getAccountSaldo( ){

         Long accountId = 1453778014537780L;
         String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/"+accountId+"/balance"+"?api_key="+apiKey;
         RestTemplate restTemplate = new RestTemplate();

         AccountSaldo accountSaldo = restTemplate.getForObject(url,AccountSaldo.class);


         return accountSaldo;
        //return accountRepository.getById(accountId);
     }
}
