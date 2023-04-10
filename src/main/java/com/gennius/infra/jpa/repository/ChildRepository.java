package com.gennius.infra.jpa.repository;

import com.gennius.infra.jpa.model.Child;
import io.quarkus.hibernate.reactive.panache.Panache;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.time.Duration;

@ApplicationScoped
public class ChildRepository implements BaseRepository<Child> {

    public Uni<Child> save(final Child child) {
        return Panache.withTransaction(() -> {
            return persist(child)
                    .ifNoItem()
                    .after(Duration.ofMillis(5000))
                    .fail();
        });
    }

    public Uni<Child> searchById(final Long id) {
        return findById(id)
                .ifNoItem()
                .after(Duration.ofMillis(10000))
                .fail();
    }
}
