package com.gennius.app.mapper;

import com.gennius.app.dto.request.ChildRequest;
import com.gennius.app.dto.response.ChildResponse;
import com.gennius.domain.entity.EChild;

import java.util.Objects;

public class DTOChildMapper {

    public static EChild requestToEntity(ChildRequest request) {
        Objects.nonNull(request);

        var e = new EChild();
        e.setFirstName(request.getFirstName());
        e.setLastName(request.getLastName());

        return e;
    }

    public static ChildResponse entityToResponse(EChild e) {
        Objects.nonNull(e);

        var r = new ChildResponse();

        r.setId(e.getId());
        r.setFirstName(e.getFirstName());
        r.setLastName(e.getLastName());
        r.setCreatedAt(e.getCreatedAt());
        r.setUpdatedAt(e.getUpdatedAt());

        return r;
    }
}
