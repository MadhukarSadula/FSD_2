package com.rest.server;


import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/AgeCal")
public class RestAgeCal {
@GET
@Produces(MediaType.TEXT_XML)

@Path("/calculateMethod/{dt}")
public String calculateMethod(@PathParam("dt") String dt)
{
	
LocalDate dob=LocalDate.parse(dt);
LocalDate curdt=LocalDate.now();
Period pd=Period.between(dob, curdt);
return pd.getYears()+" years ,"+pd.getMonths()+" months ,"+pd.getDays()+" days";



	
}
}
