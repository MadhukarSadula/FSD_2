package com.rest.server;

import java.time.LocalDate;
import java.time.Period;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("/DoubleInterger")
public class DoubleInterger {
	@GET
	@Path("/calculatMethod/{num}")
	public int calculateMethod(@PathParam("num") String num)
	{
		int dbleint=Integer.parseInt(num);
		
	return dbleint*2;


		
	}

}
