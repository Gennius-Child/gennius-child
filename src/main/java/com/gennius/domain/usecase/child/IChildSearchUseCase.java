package com.gennius.domain.usecase.child;

import com.gennius.domain.entity.EChild;
import io.smallrye.mutiny.Uni;

public interface IChildSearchUseCase {
    Uni<EChild> searchById(final Long id);
}
