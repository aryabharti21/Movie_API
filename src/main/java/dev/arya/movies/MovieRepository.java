package dev.arya.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface MovieRepository extends MongoRepository<Movies, ObjectId>{
	Optional<Movies> findMovieByImdbId(String imdbId);	
}
