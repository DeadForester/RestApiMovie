package dev.rest_api.cinema.repository;

import dev.rest_api.cinema.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepo extends MongoRepository<Movie, Object> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
