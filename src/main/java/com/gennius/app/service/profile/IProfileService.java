package com.gennius.app.service.profile;

import com.gennius.app.dto.request.ProfileRequest;
import com.gennius.app.dto.response.ProfileResponse;
import io.smallrye.mutiny.Uni;

public interface IProfileService {
    Uni<ProfileResponse> search(final Long id);

    Uni<ProfileResponse> save(ProfileRequest request);
}

