package com.soft.bankwise.web.controller;

import com.soft.bankwise.application.dto.input.CreateAccountInput;
import com.soft.bankwise.application.dto.output.AccountOutput;
import com.soft.bankwise.application.usecase.CreateAccountUseCase;
import com.soft.bankwise.utils.mapper.Mapper;
import com.soft.bankwise.web.dto.request.CreateAccountRequest;
import com.soft.bankwise.web.dto.response.AccountResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final CreateAccountUseCase createAccountUseCase;
    private final Mapper mapper;

    public AccountController(CreateAccountUseCase createAccountUseCase, Mapper mapper) {
        this.createAccountUseCase = createAccountUseCase;
        this.mapper = mapper;
    }

    @PostMapping("/accounts")
    public ResponseEntity<AccountResponse> createAccount(@RequestBody CreateAccountRequest request){

        CreateAccountInput input = mapper.toCreateAccountInput(request);
        AccountOutput output = createAccountUseCase.execute(input);
        AccountResponse response = mapper.toAccountResponse(output);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
