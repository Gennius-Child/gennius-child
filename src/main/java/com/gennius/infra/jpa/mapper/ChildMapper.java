package com.gennius.infra.jpa.mapper;

import com.gennius.domain.entity.EChild;
import com.gennius.infra.jpa.model.Child;

import java.util.Objects;

public class ChildMapper {

    public static EChild jpaToEntity(Child c) {
        Objects.nonNull(c);

        var e = new EChild();
        e.setId(c.getId());
        e.setFirstName(c.getFirstName());
        e.setLastName(c.getLastName());
        e.setCreatedAt(c.getCreatedAt());
        e.setUpdatedAt(c.getUpdatedAt());

        return e;
    }

    public static Child entityToJPA(EChild e) {
        Objects.nonNull(e);

        var c = new Child();
        c.setFirstName(e.getFirstName());
        c.setLastName(e.getLastName());

        return c;
    }
}
