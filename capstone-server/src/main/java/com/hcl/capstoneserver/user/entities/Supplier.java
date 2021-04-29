package com.hcl.capstoneserver.user.entities;

import com.hcl.capstoneserver.user.UserRole;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Supplier extends Person {
    private Float interestRate;

    public Supplier() {
    }

    public Supplier(String userId, String password, String userType, Float id, String name, String address, String email, String phone, Float interestRate) {
        super(userId, password, "SUPPLIER", id, name, address, email, phone);
        this.interestRate = interestRate;
    }

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }
}
