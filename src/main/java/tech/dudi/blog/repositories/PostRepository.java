package tech.dudi.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.dudi.blog.entities.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
