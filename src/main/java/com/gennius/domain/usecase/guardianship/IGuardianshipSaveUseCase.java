package com.gennius.domain.usecase.guardianship;

import com.gennius.domain.entity.EGuardianship;
import io.smallrye.mutiny.Uni;

public interface IGuardianshipSaveUseCase {
    Uni<EGuardianship> save(final EGuardianship eGuardianship);
}
