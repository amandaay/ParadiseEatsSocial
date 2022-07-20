package com.paradise.eats.repository;

import com.paradise.eats.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
  // PostRepository interface extends the JpaRepository interface and the SimpleJpaRepository class
  // implements the JpaRepository interface.
  //
  // SimpleJpaRepository class is an indirect implementation of the PostRepository interface.
  // (Direct implementation of JpaRepository interface).

}
