package dev.rest_api.cinema.services;

import dev.rest_api.cinema.entity.Movie;
import dev.rest_api.cinema.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private  MovieRepo movieRepo;

    public List<Movie> allMovies(){
        return movieRepo.findAll();
    }

    public Optional<Movie> singleMovie(String imdbID){
        return movieRepo.findMovieByImdbId(imdbID);
    }
}
