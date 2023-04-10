package com.gennius.domain.usecase.child;

import com.gennius.domain.entity.EChild;
import io.smallrye.mutiny.Uni;

public interface IChildSaveUseCase {
    Uni<EChild> save(final EChild eChild);
}
