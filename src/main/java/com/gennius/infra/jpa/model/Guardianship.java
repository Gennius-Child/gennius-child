package com.gennius.infra.jpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "guardianship")
public class Guardianship extends CommonDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guardianship_id", nullable = false, length = 15)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @ElementCollection
    @Column(name = "email", nullable = false)
    private Set<String> phoneNumber;

    @ManyToOne
    @JoinColumn(name = "child_id", nullable = false)
    private Child child;

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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public Set<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Set<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
