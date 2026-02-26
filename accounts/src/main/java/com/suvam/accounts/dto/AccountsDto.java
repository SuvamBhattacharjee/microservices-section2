package com.suvam.accounts.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AccountsDto {



    private Long accountNumber;

    private String accountType;

    private String branchAddress;


    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public AccountsDto(Long accountNumber, String branchAddress, String accountType) {
        this.accountNumber = accountNumber;
        this.branchAddress = branchAddress;
        this.accountType = accountType;
    }


    public AccountsDto() {
    }
}
