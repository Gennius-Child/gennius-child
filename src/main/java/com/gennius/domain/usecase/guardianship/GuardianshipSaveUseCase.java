package com.gennius.domain.usecase.guardianship;

import com.gennius.domain.entity.EGuardianship;
import com.gennius.domain.gateway.IGuardianshipGateway;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GuardianshipSaveUseCase implements IGuardianshipSaveUseCase {

    @Inject
    private IGuardianshipGateway gateway;

    @Override
    public Uni<EGuardianship> save(EGuardianship eGuardianship) {
        return gateway.save(eGuardianship);
    }
}
