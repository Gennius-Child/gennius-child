package com.gennius.app.mapper;

import com.gennius.app.dto.request.ProfileRequest;
import com.gennius.app.dto.response.ProfileResponse;
import com.gennius.domain.entity.EProfile;

import java.util.Objects;

public class DTOProfileMapper {

    public static EProfile requestToEntity(ProfileRequest request) {
        Objects.nonNull(request);

        var e = new EProfile();
        e.setAspirations(request.getAspirations());
        e.setCartoons(request.getCartoons());
        e.setDescription(request.getDescription());
        e.setMovies(request.getMovies());
        e.setSports(request.getSports());

        return e;
    }

    public static ProfileResponse entityToResponse(EProfile e) {
        Objects.nonNull(e);

        var r = new ProfileResponse();
        r.setId(e.getId());
        r.setAspirations(e.getAspirations());
        r.setCartoons(e.getCartoons());
        r.setDescription(e.getDescription());
        r.setMovies(e.getMovies());
        r.setSports(e.getSports());
        r.setCreatedAt(e.getCreatedAt());
        r.setUpdatedAt(e.getUpdatedAt());

        return r;
    }
}
