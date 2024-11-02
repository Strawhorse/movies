package dev.johnbr.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<String> allMovies() {
        return new ResponseEntity<String>("All movies!", HttpStatus.OK);

//        proper APIs should return status codes
//        can check on terminal with curl -i http://localhost:8080/api/v1/movies
//        should return a status 200

    }

}
