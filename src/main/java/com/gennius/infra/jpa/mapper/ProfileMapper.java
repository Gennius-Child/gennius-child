package com.gennius.infra.jpa.mapper;

import com.gennius.domain.entity.EProfile;
import com.gennius.infra.jpa.model.Profile;

import java.util.Objects;

public class ProfileMapper {

    public static EProfile jpaToEntity(Profile p) {
        Objects.nonNull(p);

        var e = new EProfile();
        e.setId(p.getId());
        e.setAspirations(p.getAspirations());
        e.setCartoons(p.getCartoons());
        e.setDescription(p.getDescription());
        e.setMovies(p.getMovies());
        e.setSports(p.getSports());
        e.setCreatedAt(p.getCreatedAt());
        e.setUpdatedAt(p.getUpdatedAt());

        return e;
    }

    public static Profile entityToJPA(EProfile e) {
        Objects.nonNull(e);

        var p = new Profile();
        p.setAspirations(e.getAspirations());
        p.setCartoons(e.getCartoons());
        p.setDescription(e.getDescription());
        p.setMovies(e.getMovies());
        p.setSports(e.getSports());
        p.setCreatedAt(e.getCreatedAt());
        p.setUpdatedAt(e.getUpdatedAt());

        return p;
    }
}
