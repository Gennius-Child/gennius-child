package com.gennius.domain.entity;

import java.util.Set;

public class EGuardianship extends ECommonDate {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<String> phoneNumber;
    private EChild child;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Set<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public EChild getChild() {
        return child;
    }

    public void setChild(EChild child) {
        this.child = child;
    }
}
