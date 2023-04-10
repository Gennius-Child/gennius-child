package com.gennius.domain.usecase.guardianship;

import com.gennius.domain.gateway.IGuardianshipGateway;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GuardianshipSearchUseCase implements IGuardianshipSearchUseCase {

    @Inject
    private IGuardianshipGateway gateway;

    @Override
    public Uni searchById(Long id) {
        return gateway.searchById(id);
    }
}
