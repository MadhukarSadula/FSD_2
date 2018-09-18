package com.rest.server;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Calc")
public class Calculator {
@GET
@Produces(MediaType.TEXT_XML)

@Path("/add/{a}/{b}")
public int add(@PathParam("a") String a,@PathParam("b") String b)
{
	return Integer.parseInt(a)+Integer.parseInt(b);
}
@GET
@Produces(MediaType.TEXT_XML)

@Path("/sub/{a}/{b}")
public int sub(@PathParam("a") String a,@PathParam("b") String b)
{
	return Integer.parseInt(a)-Integer.parseInt(b);
}
	
}
