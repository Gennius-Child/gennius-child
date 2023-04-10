package com.gennius.app.dto.response;

import com.gennius.app.dto.response.error.ErrorMessageResponse;

import java.time.LocalDateTime;
import java.util.Set;

public class ProfileResponse {
    private Long id;
    private String description;
    private Set<String> cartoons;
    private Set<String> movies;
    private Set<String> sports;
    private Set<String> Aspirations;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private ErrorMessageResponse errorMessageResponse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<String> getCartoons() {
        return cartoons;
    }

    public void setCartoons(Set<String> cartoons) {
        this.cartoons = cartoons;
    }

    public Set<String> getMovies() {
        return movies;
    }

    public void setMovies(Set<String> movies) {
        this.movies = movies;
    }

    public Set<String> getSports() {
        return sports;
    }

    public void setSports(Set<String> sports) {
        this.sports = sports;
    }

    public Set<String> getAspirations() {
        return Aspirations;
    }

    public void setAspirations(Set<String> aspirations) {
        Aspirations = aspirations;
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
