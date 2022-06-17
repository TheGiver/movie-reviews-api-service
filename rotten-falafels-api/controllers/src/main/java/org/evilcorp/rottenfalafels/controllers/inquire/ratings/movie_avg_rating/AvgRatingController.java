package org.evilcorp.rottenfalafels.controllers.inquire.ratings.movie_avg_rating;

import org.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.AvgMovieRatingUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/ratings/avg-rating")
public interface AvgRatingController {

    @GetMapping(produces = "application/json")
    AvgMovieRatingUseCaseResponse processRequest(@RequestParam String title);
}
