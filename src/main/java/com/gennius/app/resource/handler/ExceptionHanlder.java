package com.gennius.app.resource.handler;

import com.gennius.app.dto.response.error.ErrorMessageResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHanlder implements JavaxExceptionHandler {
    @Override
    public Response toResponse(Throwable throwable) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ErrorMessageResponse(throwable.getMessage(), 400L))
                .build();
    }
}
