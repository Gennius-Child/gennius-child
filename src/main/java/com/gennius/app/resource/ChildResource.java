package com.gennius.app.resource;

import com.gennius.app.dto.request.ChildRequest;
import com.gennius.app.service.child.IChildService;
import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@OpenAPIDefinition(
        tags = {
                @Tag(name="gennius", description="Gennius - Helping Your Gennius Kids"),
                @Tag(name="children", description="Gennius Children")
        },
        info = @Info(
                title="Gennius Children",
                version = "0.0.1",
                contact = @Contact(
                        name = "API Support",
                        url = "https://www.gennius.com/api/support",
                        email = "api.support@gennius.com"),
                license = @License(
                        name = "End-User License Agreement"
                ))
)
@Path("/children")
@ApplicationScoped
public class ChildResource {

    @Inject
    private IChildService service;

    @GET
    @Path("/{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> search(@PathParam("id") final Long id) {
        return service.search(id)
                .onItem()
                .ifNotNull()
                .transform(response -> {
                    return (response != null)
                            ? Response.ok(response).build()
                            : Response.status(Response.Status.NOT_FOUND).build();
                });
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> add(@Valid @RequestBody final ChildRequest request) {
        return service.save(request)
                .onItem()
                .ifNotNull()
                .transform(response -> {
                    return Response.ok(response).build();
                });
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> update() {
        return null;
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<Response> delete() {
        return null;
    }

}
