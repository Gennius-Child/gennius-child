package com.gennius.domain.gateway;

import com.gennius.domain.entity.EChild;
import com.gennius.infra.jpa.model.Child;
import com.gennius.infra.jpa.model.Guardianship;

import java.util.Set;

public interface IChildGateway extends IGateway<EChild> {
    Set<Child> searchChildByGuardianship(final Guardianship guardianship);
}
