package com.gennius.domain.usecase.child;

import com.gennius.domain.entity.EChild;
import com.gennius.domain.gateway.IChildGateway;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ChildSearchUseCase implements IChildSearchUseCase {

    @Inject
    private IChildGateway gateway;

    @Override
    public Uni<EChild> searchById(Long id) {
        return gateway.searchById(id);
    }
}
