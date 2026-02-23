package com.suvam.accounts.service.impl;


import com.suvam.accounts.dto.CustomerDto;
import com.suvam.accounts.repo.AccountsRepository;
import com.suvam.accounts.repo.CustomerRepository;
import com.suvam.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {


    @Override
    public void createAccount(CustomerDto customerDto) {

         AccountsRepository accountsRepository;
         CustomerRepository customerRepository;



    }
}
