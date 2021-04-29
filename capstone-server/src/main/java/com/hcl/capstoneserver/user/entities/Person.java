package com.hcl.capstoneserver.user.entities;

import javax.persistence.*;

@MappedSuperclass
public class Person extends AppUser {
    @Column(unique = true)
    private Float id;
    private String name;
    private String address;
    private String email;
    private String phone;

    public Person() {
    }

    public Person(String userId, String password, String userType, Float id, String name, String address, String email, String phone) {
        super(userId, password, userType);
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Float getId() {
        return id;
    }

    public void setId(Float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
