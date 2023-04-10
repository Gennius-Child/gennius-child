package com.gennius.app.resource.handler;

import com.gennius.app.dto.response.error.ErrorMessageResponse;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class JavaxConstraintViolationHandler implements ExceptionMapper<ConstraintViolationException> {
    @Override
    public Response toResponse(ConstraintViolationException e) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new ErrorMessageResponse(e.getMessage(), 400L)).build();
    }
}
