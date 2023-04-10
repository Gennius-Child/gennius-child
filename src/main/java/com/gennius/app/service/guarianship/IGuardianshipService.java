package com.gennius.app.service.guarianship;

import com.gennius.app.dto.request.GuardianshipRequest;
import com.gennius.app.dto.response.GuardianshipResponse;
import io.smallrye.mutiny.Uni;

public interface IGuardianshipService {
    Uni<GuardianshipResponse> search(final Long id);

    Uni<GuardianshipResponse> save(GuardianshipRequest request);
}

