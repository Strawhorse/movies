package dev.johnbr.movies.Service;

import dev.johnbr.movies.Movie;
import dev.johnbr.movies.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


//Most business logic takes place in service class/es


@Service
public class MovieService {

//    repository will either need a constructor or can be annotated as @Autowired

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }

}
