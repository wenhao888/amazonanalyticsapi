package com.handacc.amz.analytics.features.account;


import com.handacc.amz.analytics.features.account.dto.CreateAccountRequest;
import com.handacc.amz.analytics.features.account.dto.CreateAccountResponse;
import com.handacc.amz.analytics.features.account.entity.UserEntity;
import com.handacc.amz.analytics.features.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/accounts", method= RequestMethod.POST)
    public CreateAccountResponse createAccount(@RequestBody CreateAccountRequest request) {
        UserEntity user = accountService.createAccount(request);
        CreateAccountResponse accountResponse = new CreateAccountResponse();
        accountResponse.setId(user.getId());

        return accountResponse;
    }

}
