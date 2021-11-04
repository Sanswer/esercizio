package com.fabrick.esercizio.controller;

import com.fabrick.esercizio.model.Account;
//import com.fabrick.esercizio.repository.AccountRepository;
import com.fabrick.esercizio.model.AccountSaldo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@RequestMapping(value={"/test"})
public class AccountController {

  //   @Autowired
   // AccountRepository accountRepository;
/*
    @Value("${api.key}")
    private String apiKey;

    @Value("${auth.schema}")
    private String autSchema;


 */
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/saldo")
    public ResponseEntity<AccountSaldo> getAccountSaldo( ){

         //input
         String accountId = "1453778014537780";

         String url = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/"+accountId+"/balance";//+"?api_key="+apiKey;

         HttpHeaders headers = new HttpHeaders();
         headers.add("Auth-Schema","S2S");
         headers.add("Api-Key" ,"FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP");
         HttpEntity<String> entity = new HttpEntity<String>(headers);

        AccountSaldo output = new AccountSaldo(); //model risposta

       //  RestTemplate restTemplate = new RestTemplate();
        // ResponseEntity<AccountSaldo> response = restTemplate.getForEntity(url ,AccountSaldo.class, );
         output= restTemplate.getForObject(url,AccountSaldo.class, entity);
        //if (response.getStatusCode()==HttpStatus.OK){
             //System.out.println(response);


         return new ResponseEntity<>(output,HttpStatus.OK);


         }




     }

