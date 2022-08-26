package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.payload.PostDto;
import com.example.demo.payload.PostResponse;

import java.util.List;
import java.util.Optional;

public interface PostService {
    PostDto createPost(PostDto postDto);
    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
    PostDto getPostById(Long id);
    PostDto updatePost(PostDto postDto, Long id);
    void deletePostById(Long id);
}
