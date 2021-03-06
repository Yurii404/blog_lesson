package com.yuriikupchin.pricer.repo;

import com.yuriikupchin.pricer.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

}
