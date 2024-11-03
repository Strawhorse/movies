package dev.johnbr.movies.Repository;

//repositories are of type interface

import dev.johnbr.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {


//    use automated query to create method to search by IMDB id because we shouldn't expose the database ID names to the public

    Optional<Movie> findMovieByImdbId(String imdbId);

}
