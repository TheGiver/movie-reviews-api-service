package com.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_negative_reviews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reviews/all")
public interface NegativeMovieReviewsController {

    @GetMapping(produces = "application/json")
    Reviews processRequest(@RequestParam String title);
}
