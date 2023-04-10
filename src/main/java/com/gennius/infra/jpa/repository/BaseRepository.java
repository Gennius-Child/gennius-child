package com.gennius.infra.jpa.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;

public interface BaseRepository<T> extends PanacheRepository<T> {

    Uni<T> save(final T t);

    Uni<T> searchById(final Long id);
}
