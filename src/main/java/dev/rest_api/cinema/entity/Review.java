package dev.rest_api.cinema.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    @Id
    private Object id;
    private String reviewsBody;

    public Review(String reviewsBody) {
        this.reviewsBody = reviewsBody;
    }
}
