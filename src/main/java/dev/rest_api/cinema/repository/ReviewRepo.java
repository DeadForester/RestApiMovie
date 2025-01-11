package dev.rest_api.cinema.repository;

import dev.rest_api.cinema.entity.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends MongoRepository<Review, Object> {
}
