package com.gennius.domain.usecase.profile;

import com.gennius.domain.entity.EProfile;
import io.smallrye.mutiny.Uni;

public interface IProfileSaveUseCase {
    Uni<EProfile> save(final EProfile eProfile);
}
