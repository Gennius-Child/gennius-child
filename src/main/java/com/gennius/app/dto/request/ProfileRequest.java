package com.gennius.app.dto.request;

import java.util.Set;

public class ProfileRequest {
    private String description;
    private Set<String> cartoons;
    private Set<String> movies;
    private Set<String> sports;
    private Set<String> Aspirations;

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
}
