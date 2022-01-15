package com.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_reviews;

import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.AllMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reviews/all")
public interface MovieReviewsController {

    @GetMapping(produces = "application/json")
    AllMovieReviewsUseCaseResponse processRequest(@RequestParam String title);
}
