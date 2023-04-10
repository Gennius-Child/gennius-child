package com.gennius.domain.usecase.profile;

import com.gennius.domain.entity.EProfile;
import io.smallrye.mutiny.Uni;

public interface IProfileSearchUseCase {
    Uni<EProfile> searchById(final Long id);
}
