package com.rest.client;

import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {
	
	static final String REST_URL = "http://localhost:8080/RESTFul_Calculator/Calc";
	static final String add = "/add";
	static final String sub = "/sub";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter value1: ");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        System.out.print("Please enter value2: ");
        String input2 = scanner.next();
        
        Client restClient = Client.create();
		WebResource service = restClient.resource(REST_URL);
		WebResource addition = service.path(add).path(input1+"/"+input2);
		System.out.println("Response: " + getResponse(addition));
		System.out.println("Output: " + getOutputAsXML(addition));
		System.out.println("---------------------------------------------------");
		WebResource subtract = service.path(sub).path(input1+"/"+input2);
		System.out.println("Response: " + getResponse(subtract));
		System.out.println("Output: " + getOutputAsXML(subtract));
		System.out.println("---------------------------------------------------");
        
        scanner.close();
        
	}

	private static String getResponse(WebResource service) {
		return service.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString();
	}
	
	private static String getOutputAsXML(WebResource service) {
		return service.accept(MediaType.TEXT_PLAIN).get(String.class);
	}

}
