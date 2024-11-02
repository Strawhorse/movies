package dev.johnbr.movies.Repository;

//repositories are of type interface

import dev.johnbr.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

}
