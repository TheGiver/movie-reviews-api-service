package com.evilcorp.rottenfalafels.controllers.inquire.ratings.movie_ratings;

import com.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.MovieRatingsUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/rating")
public interface MovieRatingsController {

    @GetMapping(produces = "application/json")
    MovieRatingsUseCaseResponse processRequest(@RequestParam String title);
}
