package com.gennius.domain.gateway;

import io.smallrye.mutiny.Uni;

public interface IGateway<T> {
    Uni<T> searchById(final Long id);

    Uni<T> save(final T t);
}
