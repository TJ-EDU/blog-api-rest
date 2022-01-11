package tech.dudi.blog.services;

import java.util.List;

import tech.dudi.blog.payload.PostDto;

public interface PostService {

    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(Long id);

    PostDto updatePostDto(PostDto postDto, Long id);

    void deletePostById(Long id);

}
