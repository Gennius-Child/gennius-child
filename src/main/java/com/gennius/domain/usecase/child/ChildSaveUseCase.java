package com.gennius.domain.usecase.child;

import com.gennius.domain.entity.EChild;
import com.gennius.domain.gateway.IChildGateway;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ChildSaveUseCase implements IChildSaveUseCase {

    @Inject
    private IChildGateway gateway;

    @Override
    public Uni<EChild> save(EChild child) {
        return gateway.save(child);
    }
}
