package org.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_negative_reviews;

import org.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.NegativeMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reviews/all")
public interface NegativeMovieReviewsController {

    @GetMapping(produces = "application/json")
    NegativeMovieReviewsUseCaseResponse processRequest(@RequestParam String title);
}
