package com.gennius.domain.usecase.guardianship;

import com.gennius.domain.entity.EGuardianship;
import io.smallrye.mutiny.Uni;

public interface IGuardianshipSearchUseCase {
    Uni<EGuardianship> searchById(final Long id);
}
