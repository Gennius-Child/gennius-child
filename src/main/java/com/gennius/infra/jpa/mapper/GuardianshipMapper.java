package com.gennius.infra.jpa.mapper;

import com.gennius.domain.entity.EGuardianship;
import com.gennius.infra.jpa.model.Guardianship;

import java.util.Objects;

public class GuardianshipMapper {

    public static EGuardianship jpaToEntity(Guardianship g) {
        Objects.nonNull(g);

        var e = new EGuardianship();
        e.setId(g.getId());
        e.setFirstName(g.getFirstName());
        e.setLastName(g.getLastName());
        e.setEmail(g.getEmail());
        e.setPhoneNumber(g.getPhoneNumber());
        e.setCreatedAt(g.getCreatedAt());
        e.setUpdatedAt(g.getUpdatedAt());

        return e;
    }

    public static Guardianship entityToJPA(EGuardianship e) {
        Objects.nonNull(e);

        var g = new Guardianship();
        g.setFirstName(e.getFirstName());
        g.setLastName(e.getLastName());
        g.setEmail(e.getEmail());
        g.setPhoneNumber(e.getPhoneNumber());

        return g;
    }
}
