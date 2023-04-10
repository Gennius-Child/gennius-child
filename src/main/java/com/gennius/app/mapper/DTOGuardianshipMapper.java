package com.gennius.app.mapper;

import com.gennius.app.dto.request.GuardianshipRequest;
import com.gennius.app.dto.response.GuardianshipResponse;
import com.gennius.domain.entity.EGuardianship;

import java.util.Objects;

public class DTOGuardianshipMapper {

    public static EGuardianship requestToEntity(GuardianshipRequest request) {
        Objects.nonNull(request);

        var e = new EGuardianship();
        e.setFirstName(request.getFirstName());
        e.setLastName(request.getLastName());
        e.setEmail(request.getEmail());
        e.setPhoneNumber(request.getPhoneNumber());

        return e;
    }

    public static GuardianshipResponse entityToResponse(EGuardianship e) {
        Objects.nonNull(e);

        var r = new GuardianshipResponse();
        r.setId(e.getId());
        r.setFirstName(e.getFirstName());
        r.setLastName(e.getLastName());
        r.setEmail(e.getEmail());
        r.setPhoneNumber(e.getPhoneNumber());
        r.setCreatedAt(e.getCreatedAt());
        r.setUpdatedAt(e.getUpdatedAt());

        return r;
    }
}
