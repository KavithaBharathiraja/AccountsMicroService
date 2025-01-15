package com.MS.AccountsMicroService.Services.Interface;

import com.MS.AccountsMicroService.models.Accounts;

import java.util.List;

public interface AccountServiceInterface {
    List<Accounts> getAllAccounts();
    Accounts getAccountById(Long accountId);
    Accounts addAccount(Accounts accounts);
    void deleteAccount(Long accountId);
    Accounts updateAccount(Accounts accounts);
}