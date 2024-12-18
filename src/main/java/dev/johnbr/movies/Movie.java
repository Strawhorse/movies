package dev.johnbr.movies;

//Lombok import takes care of getters and setters
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


import java.util.List;

//Annotate as a document to tell framework that this class represents each document in the movies collection

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

//    database will only store the ids of the review  and the reviews will be in a separate collection
//    a manual reference relationship
    @DocumentReference
    private List<Review> reviewIds;


}
