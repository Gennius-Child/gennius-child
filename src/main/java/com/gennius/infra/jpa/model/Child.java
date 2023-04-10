package com.gennius.infra.jpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "child")
public class Child extends CommonDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "child_id", nullable = false, length = 15)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @OneToMany(mappedBy = "child")
    private List<Guardianship> guardianshipList;

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

    public List<Guardianship> getGuardianshipList() {
        return guardianshipList;
    }

    public void setGuardianshipList(List<Guardianship> guardianshipList) {
        this.guardianshipList = guardianshipList;
    }
}
