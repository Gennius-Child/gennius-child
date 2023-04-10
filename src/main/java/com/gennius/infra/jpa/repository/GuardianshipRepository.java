package com.gennius.infra.jpa.repository;

import com.gennius.infra.jpa.model.Guardianship;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;

@ApplicationScoped
public class GuardianshipRepository implements BaseRepository<Guardianship> {

    @Override
    public Uni<Guardianship> save(Guardianship guardianship) {
        return Panache.withTransaction(() -> {
            return persist(guardianship)
                    .ifNoItem()
                    .after(Duration.ofMillis(5000))
                    .fail();
        });
    }

    @Override
    public Uni<Guardianship> searchById(Long id) {
        return findById(id)
                .ifNoItem()
                .after(Duration.ofMillis(10000))
                .fail();
    }
}
