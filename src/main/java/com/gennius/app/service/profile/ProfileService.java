package com.gennius.app.service.profile;

import com.gennius.app.dto.request.ProfileRequest;
import com.gennius.app.dto.response.ProfileResponse;
import com.gennius.app.mapper.DTOProfileMapper;
import com.gennius.domain.usecase.profile.IProfileSaveUseCase;
import com.gennius.domain.usecase.profile.IProfileSearchUseCase;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProfileService implements IProfileService {

    @Inject
    private IProfileSearchUseCase searchUseCase;

    @Inject
    private IProfileSaveUseCase saveUseCase;

    @Override
    public Uni<ProfileResponse> search(Long id) {
        return searchUseCase.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOProfileMapper.entityToResponse(e);
                });
    }

    @Override
    public Uni<ProfileResponse> save(ProfileRequest profileRequest) {
        return saveUseCase.save(DTOProfileMapper.requestToEntity(profileRequest))
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOProfileMapper.entityToResponse(e);
                });
    }
}
