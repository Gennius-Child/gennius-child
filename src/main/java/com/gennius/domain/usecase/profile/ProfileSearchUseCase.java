package com.gennius.domain.usecase.profile;

import com.gennius.domain.entity.EProfile;
import com.gennius.domain.gateway.IProfileGateway;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProfileSearchUseCase implements IProfileSearchUseCase {

    @Inject
    private IProfileGateway gateway;

    @Override
    public Uni<EProfile> searchById(Long id) {
        return gateway.searchById(id);
    }
}
