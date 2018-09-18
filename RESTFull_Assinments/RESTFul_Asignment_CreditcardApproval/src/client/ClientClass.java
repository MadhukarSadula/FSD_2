package client;

import java.util.Scanner;
import com.Approval.*;

import javax.jws.WebService;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientClass {
	static final String REST_URL = "http://localhost:8080/RESTFul_Asignment_CreditcardApproval";
	static final String Validate_Path = "/CardApprover/approvalMethod";
	
//RESTFul_Asignment_CreditcardApproval
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credit card number:");
	 String src=sc.nextLine();
	 Client restClient = Client.create();
		WebResource service = restClient.resource(REST_URL);
		WebResource validateService = service.path(Validate_Path).path(src);
		System.out.println("Response: " + getResponse(validateService));
		System.out.println("Output: " + getOutputAsXML(validateService));
		System.out.println("---------------------------------------------------");
		sc.close();

		
	}

private static String getOutputAsXML(WebResource validateService) {
		// TODO Auto-generated method stub
	return validateService.accept(MediaType.TEXT_PLAIN).get(String.class);
}

private static String getResponse(WebResource service) {
	// TODO Auto-generated method stub
	return service.accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString();
}
	

}
