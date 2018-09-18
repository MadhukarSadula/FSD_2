package com.rest.client;

import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.rest.server.Employee;
import com.rest.server.RestServer;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class ResrClient {
	static final String REST_URL = "http://localhost:8080/RESTFul_Employee/Employee";
	static final String add = "/add";
	static final String update = "/update";
	static final String list1 = "/list";
	static final String delete = "/delete";
	
	   public static void main(String[] args) {
	      
	      
	      //RestServer ME = new RestServer();
	      Client restClient = Client.create();
			WebResource service = restClient.resource(REST_URL);
			WebResource empID1 = service.path(add).path("Zara"+"/"+"Ali"+"/"+"1000");
			WebResource empID2 = service.path(add).path("Zara"+"/"+"Ali"+"/"+"1000");
			WebResource  empID3= service.path(add).path("Zara"+"/"+"Ali"+"/"+"1000");
			
			System.out.println("adding new empoyees using PUT:");
			System.out.println("Response: " + getResponse(empID1));
			System.out.println("Output: " + getOutputAsXML(empID1));
			System.out.println("Response: " + getResponse(empID2));
			System.out.println("Output: " + getOutputAsXML(empID2));
			System.out.println("Response: " + getResponse(empID3));
			System.out.println("Output: " + getOutputAsXML(empID3));
			System.out.println("Listing  empoyees using GET:");
			
			WebResource list2 = service.path(list1);
			
			System.out.println("Response: " + getResponse(list2));
			System.out.println("Output: " + getOutputAsXML(list2));
			
	      
System.out.println("Listing  empoyees using GET:");
			
			WebResource updt = service.path(delete).path("1");
			System.out.println("Response: " + getResponse(updt));
			System.out.println("Output: " + getOutputAsXML(updt));
			
			//ME.updateEmployee(empID1, "5000");

	      /* Delete an employee from the database */
System.out.println("Updating  empoyees using POST:");
			
			WebResource updt1 = service.path(update).path("2"+"/"+"6000");
			System.out.println("Response: " + getResponse(updt1));
			System.out.println("Output: " + getOutputAsXML(updt1));

	      System.out.println("Listing  new empoyees using GET:");

	      WebResource list = service.path(list1);
			
			System.out.println("Response: " + getResponse(list));
			System.out.println("Output: " + getOutputAsXML(list));
			}

	   private static String getResponse(WebResource service) {
			return service.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString();
		}
		
		private static String getOutputAsXML(WebResource service) {
			return service.accept(MediaType.TEXT_PLAIN).get(String.class);
		}
}
