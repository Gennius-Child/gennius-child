package com.gennius.domain.entity;

import java.util.Set;

public class EChild extends ECommonDate {
    private Long id;
    private String firstName;
    private String lastName;
    private Set<EGuardianship> guardianshipSet;

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

    public Set<EGuardianship> getGuardianshipSet() {
        return guardianshipSet;
    }

    public void setGuardianshipSet(Set<EGuardianship> guardianshipSet) {
        this.guardianshipSet = guardianshipSet;
    }
}
