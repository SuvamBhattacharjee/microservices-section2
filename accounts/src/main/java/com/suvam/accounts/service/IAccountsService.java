package com.suvam.accounts.service;

import com.suvam.accounts.dto.CustomerDto;
import jakarta.validation.Valid;

public interface IAccountsService {


    void createAccount(@Valid CustomerDto customerDto);
}
