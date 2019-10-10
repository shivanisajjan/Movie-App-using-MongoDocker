package com.stackroute.userservice.repository;

import com.stackroute.userservice.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie,Integer> {
//    @Query(value = "SELECT * FROM Movie m WHERE m.title = :title", nativeQuery=true)
    List<Movie> findBytitle(@Param("title") String title);
}
