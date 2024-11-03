package dev.johnbr.movies.Service;

import dev.johnbr.movies.Movie;
import dev.johnbr.movies.Repository.ReviewRepository;
import dev.johnbr.movies.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    //        create link to review database/repository
    @Autowired
    private ReviewRepository reviewRepository;

//    create template to use to write review to movie - MongoTemplate to create a dynamic query
    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String reviewBody, String imdbId) {

        Review review = reviewRepository.insert(new Review(reviewBody));

        //        link review to the specific movie it's for
        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId)).apply(new Update().push(
                "reviewsIds").value(review)).first();

//return created view
        return review;
    }
}
