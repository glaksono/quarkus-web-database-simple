package id.gregscode.quarkus.api;

import id.gregscode.quarkus.api.model.RequestSimple;
import id.gregscode.quarkus.service.SimpleService;
import org.jboss.resteasy.annotations.Body;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/simple")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SimpleResource {

    @Inject
    SimpleService simpleService;

    @GET
    @Path("/{id}")
    public Response get(@PathParam("id") Long id){
        return Response.ok(simpleService.get(id)).build();
    }

    @POST
    public Response save(RequestSimple requestSimple){
        simpleService.save(requestSimple);
        return Response.accepted().build();
    }


}
