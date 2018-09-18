package com.Approval;


import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/CardApprover")
public class CardApprover {

	@GET
	@Path("approvalMethod/{num}")
	@Produces(MediaType.TEXT_XML)
	public String approvalMethod(@PathParam("num") double num)
	{
		String Res=null;
		if(num%2==0)
		{
			Res="Valid";
		}
		
		else
			Res="InValid";
		return Res;
	}
	
}
