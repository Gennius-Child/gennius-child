package com.gennius.app.service.child;

import com.gennius.app.dto.request.ChildRequest;
import com.gennius.app.dto.response.ChildResponse;
import io.smallrye.mutiny.Uni;

public interface IChildService {
    Uni<ChildResponse> search(final Long id);

    Uni<ChildResponse> save(ChildRequest request);
}
