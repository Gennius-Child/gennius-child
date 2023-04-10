package com.gennius.infra.jpa.repository;

import com.gennius.infra.jpa.model.Profile;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;

@ApplicationScoped
public class ProfileRepository implements BaseRepository<Profile> {
    @Override
    public Uni<Profile> save(Profile profile) {
        return Panache.withTransaction(() -> {
            return persist(profile)
                    .ifNoItem()
                    .after(Duration.ofMillis(5000))
                    .fail();
        });
    }

    @Override
    public Uni<Profile> searchById(Long id) {
        return findById(id)
                .ifNoItem()
                .after(Duration.ofMillis(10000))
                .fail();
    }
}
