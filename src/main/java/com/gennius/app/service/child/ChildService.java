package com.gennius.app.service.child;

import com.gennius.app.dto.request.ChildRequest;
import com.gennius.app.dto.response.ChildResponse;
import com.gennius.app.mapper.DTOChildMapper;
import com.gennius.domain.usecase.child.IChildSaveUseCase;
import com.gennius.domain.usecase.child.IChildSearchUseCase;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ChildService implements IChildService {

    @Inject
    private IChildSearchUseCase searchUseCase;

    @Inject
    private IChildSaveUseCase saveUseCase;

    @Override
    public Uni<ChildResponse> search(Long id) {
        return searchUseCase.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOChildMapper.entityToResponse(e);
                });
    }

    @Override
    public Uni<ChildResponse> save(ChildRequest childRequest) {
        return saveUseCase.save(DTOChildMapper.requestToEntity(childRequest))
                .onItem()
                .ifNotNull()
                .transform(e -> {
                    return DTOChildMapper.entityToResponse(e);
                });
    }
}
