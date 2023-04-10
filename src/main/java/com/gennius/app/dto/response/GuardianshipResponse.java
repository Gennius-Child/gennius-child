package com.gennius.app.dto.response;

import com.gennius.app.dto.response.error.ErrorMessageResponse;

import java.time.LocalDateTime;
import java.util.Set;

public class GuardianshipResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<String> phoneNumber;
    private ChildResponse childResponse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ErrorMessageResponse errorMessageResponse;

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

    public ChildResponse getChildResponse() {
        return childResponse;
    }

    public void setChildResponse(ChildResponse childResponse) {
        this.childResponse = childResponse;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ErrorMessageResponse getErrorMessageResponse() {
        return errorMessageResponse;
    }

    public void setErrorMessageResponse(ErrorMessageResponse errorMessageResponse) {
        this.errorMessageResponse = errorMessageResponse;
    }
}
