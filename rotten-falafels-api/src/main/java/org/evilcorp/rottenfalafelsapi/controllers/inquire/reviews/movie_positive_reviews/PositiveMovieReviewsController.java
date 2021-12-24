package org.evilcorp.rottenfalafelsapi.controllers.inquire.reviews.movie_positive_reviews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews/good")
public interface PositiveMovieReviewsController {

    @GetMapping(produces = "application/json")
    Reviews processRequest(@RequestParam String title);
}
