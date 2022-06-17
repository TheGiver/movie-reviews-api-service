package org.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_positive_reviews;

import org.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.PositiveMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reviews/good")
public interface PositiveMovieReviewsController {

    @GetMapping(produces = "application/json")
    PositiveMovieReviewsUseCaseResponse processRequest(@RequestParam String title);
}
