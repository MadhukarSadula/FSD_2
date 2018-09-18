package com.rest.client;

import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class RestClient {

	static final String REST_URL = "http://localhost:8080/RESTFul_DoubleTheInteger";
	static final String GetAge = "/DoubleInterger/calculateMethod";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the integer");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Client restClient = Client.create();
		WebResource service = restClient.resource(REST_URL);
		WebResource Age = service.path(GetAge).path(input);
		System.out.println("Response: " + getResponse(Age));
		System.out.println("Output: " + getOutputAsXML(Age));
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
