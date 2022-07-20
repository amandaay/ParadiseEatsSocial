package com.paradise.eats.controller;

import com.paradise.eats.payload.PostDto;
import com.paradise.eats.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // converts a response that is a java object into JSON
@RequestMapping("/api/posts") // provides the main endpoint url
public class PostController {

    // inject a service class in the controller
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // create post REST API
    // @RequestBody: to convert JSON object that is PostDto
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }

    // get all posts rest api
    @GetMapping
    public List<PostDto> getAllPosts(){
        return postService.getAllPosts();
    }
}
