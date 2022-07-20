package com.paradise.eats.service;

import com.paradise.eats.entity.Post;
import com.paradise.eats.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();
}
