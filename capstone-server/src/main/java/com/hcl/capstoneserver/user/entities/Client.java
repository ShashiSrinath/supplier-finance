package com.hcl.capstoneserver.user.entities;

import com.hcl.capstoneserver.user.UserRole;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Client extends Person {
    private Float interestRate;
    private int accountNumber;

    public Client() {
        super();
    }

    public Client(String userId, String password, String userType, Float id, String name, String address, String email, String phone, Float interestRate, int accountNumber) {
        super(userId, password, "CLIENT", id, name, address, email, phone);
        this.interestRate = interestRate;
        this.accountNumber = accountNumber;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
