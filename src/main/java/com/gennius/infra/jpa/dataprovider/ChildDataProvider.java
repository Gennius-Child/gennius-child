package com.gennius.infra.jpa.dataprovider;

import com.gennius.domain.entity.EChild;
import com.gennius.domain.gateway.IChildGateway;
import com.gennius.infra.jpa.mapper.ChildMapper;
import com.gennius.infra.jpa.model.Child;
import com.gennius.infra.jpa.model.Guardianship;
import com.gennius.infra.jpa.repository.ChildRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;
import java.util.Set;

@ApplicationScoped
public class ChildDataProvider implements IChildGateway {

    @Inject
    private ChildRepository repository;

    @Override
    public Uni<EChild> searchById(Long id) {
        Objects.nonNull(id);

        return repository.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return ChildMapper.jpaToEntity(jpa);
                });
    }

    @Override
    public Uni<EChild> save(EChild eChild) {
        Objects.nonNull(eChild);

        var child = ChildMapper.entityToJPA(eChild);

        child.setCreatedAt(
                LocalDateTime.now()
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime());

        return repository.save(child)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return ChildMapper.jpaToEntity(jpa);
                });
    }

    @Override
    public Set<Child> searchChildByGuardianship(Guardianship guardianship) {
        return null;
    }
}
