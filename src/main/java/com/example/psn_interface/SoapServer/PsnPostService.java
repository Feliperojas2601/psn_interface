package com.example.psn_interface.SoapServer;


import localhost.soap.api.welcomepost.GetPostRequest;
import localhost.soap.api.welcomepost.PostType;
import org.springframework.stereotype.Service;


@Service
public class PsnPostService {
	public PostType getWelcomePost(GetPostRequest request) {
		PostType post = new PostType();
		post.setPostId(request.getPostId());
		post.setOwnerId(1);
		post.setLocation("Example Location");
		post.setDescription("Example Description");
		return post;
	}

	// Agrega métodos adicionales de servicio según sea necesario
}
