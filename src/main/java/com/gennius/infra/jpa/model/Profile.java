package com.gennius.infra.jpa.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profile")
public class Profile extends CommonDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profile_id", nullable = false, length = 15)
    private Long id;

    @Column(name = "description", nullable = false)
    private String description;

    @ElementCollection
    @Column(name = "cartoons", nullable = false)
    private Set<String> cartoons;

    @ElementCollection
    @Column(name = "movies", nullable = false)
    private Set<String> movies;

    @ElementCollection
    @Column(name = "sports", nullable = false)
    private Set<String> sports;

    @ElementCollection
    @Column(name = "aspirations", nullable = false)
    private Set<String> Aspirations;

    @OneToOne
    @JoinColumn(name = "child_id", nullable = false)
    private Child child;

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

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
