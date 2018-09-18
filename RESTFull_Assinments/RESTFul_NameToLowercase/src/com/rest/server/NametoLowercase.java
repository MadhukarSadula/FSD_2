	package com.rest.server;

	import java.time.LocalDate;
	import java.time.Period;

	import javax.websocket.server.PathParam;
	import javax.ws.rs.GET;
	import javax.ws.rs.Path;
	@Path("/NametoLower")
public class NametoLowercase {

		@GET
		@Path("/calculatMethod/{num}")
		public String calculateMethod(@PathParam("num") String num)
		{
			
			
		return num.toLowerCase();


			
		}

	}

