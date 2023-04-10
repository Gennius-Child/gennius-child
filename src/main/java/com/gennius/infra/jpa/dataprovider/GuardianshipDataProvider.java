package com.gennius.infra.jpa.dataprovider;

import com.gennius.domain.entity.EGuardianship;
import com.gennius.domain.gateway.IGuardianshipGateway;
import com.gennius.infra.jpa.mapper.GuardianshipMapper;
import com.gennius.infra.jpa.repository.GuardianshipRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

@ApplicationScoped
public class GuardianshipDataProvider implements IGuardianshipGateway {

    private GuardianshipRepository repository;

    @Override
    public Uni<EGuardianship> searchById(Long id) {
        Objects.nonNull(id);

        return repository.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return GuardianshipMapper.jpaToEntity(jpa);
                });
    }

    @Override
    public Uni<EGuardianship> save(EGuardianship eGuardianship) {
        Objects.nonNull(eGuardianship);

        var guardianship = GuardianshipMapper.entityToJPA(eGuardianship);

        guardianship.setCreatedAt(
                LocalDateTime.now()
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime());

        return repository.save(guardianship)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return GuardianshipMapper.jpaToEntity(jpa);
                });
    }
}
