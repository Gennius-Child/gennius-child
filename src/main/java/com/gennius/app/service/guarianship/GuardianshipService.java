package com.gennius.app.service.guarianship;

import com.gennius.app.dto.request.GuardianshipRequest;
import com.gennius.app.dto.response.GuardianshipResponse;
import com.gennius.app.mapper.DTOGuardianshipMapper;
import com.gennius.domain.usecase.guardianship.IGuardianshipSaveUseCase;
import com.gennius.domain.usecase.guardianship.IGuardianshipSearchUseCase;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GuardianshipService implements IGuardianshipService {

    @Inject
    private IGuardianshipSearchUseCase searchUseCase;

    @Inject
    private IGuardianshipSaveUseCase saveUseCase;

    @Override
    public Uni<GuardianshipResponse> search(Long id) {
        return searchUseCase.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOGuardianshipMapper.entityToResponse(e);
                });
    }

    @Override
    public Uni<GuardianshipResponse> save(GuardianshipRequest guardianshipRequest) {
        return saveUseCase.save(DTOGuardianshipMapper.requestToEntity(guardianshipRequest))
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOGuardianshipMapper.entityToResponse(e);
                });
    }
}
