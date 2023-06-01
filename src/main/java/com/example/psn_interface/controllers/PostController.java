package com.example.psn_interface.controllers;
import com.example.psn_interface.repositories.PostRepository;
import com.example.psn_interface.entities.Post;
import com.example.psn_interface.soapConfig.SoapClasses.GetPostRequest;
import com.example.psn_interface.soapConfig.SoapClasses.PostType;
import org.springframework.stereotype.Service;


@Service
public class PostController {
	private final PostRepository repository;

	public PostController() {
		this.repository = new PostRepository();
	}

	public PostType getWelcomePost(GetPostRequest request) {
		PostType response = new PostType();
		Post postData= repository.getPost();
		response.setPostId(postData._id());
		response.setOwnerId(postData.ownerId());
		response.setLocation(postData.location());
		response.setDescription(postData.description());
		return response;
	}
}
