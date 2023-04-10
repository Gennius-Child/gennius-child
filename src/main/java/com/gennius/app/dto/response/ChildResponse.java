package com.gennius.app.dto.response;

import com.gennius.app.dto.response.error.ErrorMessageResponse;

import java.time.LocalDateTime;

public class ChildResponse {
    private Long id;
    private String firstName;
    private String lastName;
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
