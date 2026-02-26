package com.suvam.accounts.dto;

import lombok.*;



public class CustomerDto {

    private String name;

    private String mobileNumber;

    private String email;

    private AccountsDto accountsDto;

    public CustomerDto() {

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

    public CustomerDto(String name, AccountsDto accountsDto, String email, String mobileNumber) {
        this.name = name;
        this.accountsDto = accountsDto;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }
}
