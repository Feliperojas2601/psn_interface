package com.example.psn_interface.SoapServer;


import localhost.soap.api.welcomepost.GetPostRequest;
import localhost.soap.api.welcomepost.PostType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PsnSoapPostEndpoint {

	private static final String NAMESPACE_URI = "http://localhost/soap/api/WelcomePost";

	private PsnPostService service;
	@Autowired
	private PsnSoapPostEndpoint(PsnPostService service){this.service = service;}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPostRequest")
	@ResponsePayload
	public PostType getWelcomePost(@RequestPayload GetPostRequest request) {
		PostType response  = service.getWelcomePost(request);
		return  response;
	}

}
