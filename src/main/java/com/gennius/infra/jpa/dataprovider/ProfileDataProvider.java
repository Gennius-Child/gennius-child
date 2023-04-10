package com.gennius.infra.jpa.dataprovider;

import com.gennius.domain.entity.EProfile;
import com.gennius.domain.gateway.IProfileGateway;
import com.gennius.infra.jpa.mapper.ProfileMapper;
import com.gennius.infra.jpa.repository.ProfileRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

@ApplicationScoped
public class ProfileDataProvider implements IProfileGateway {

    @Inject
    private ProfileRepository repository;

    @Override
    public Uni<EProfile> searchById(Long id) {
        Objects.nonNull(id);

        return repository.searchById(id)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return ProfileMapper.jpaToEntity(jpa);
                });
    }

    @Override
    public Uni<EProfile> save(EProfile eProfile) {
        Objects.nonNull(eProfile);

        var profile = ProfileMapper.entityToJPA(eProfile);

        profile.setCreatedAt(
                LocalDateTime.now()
                        .atZone(ZoneId.of("UTC"))
                        .toLocalDateTime());

        return repository.save(profile)
                .onItem()
                .ifNotNull()
                .transform(jpa -> {
                    return ProfileMapper.jpaToEntity(jpa);
                });
    }
}
