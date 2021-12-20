package org.evilcorp.rottenfalafelsapi.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

    @GetMapping("/movies/summary/all")
    public @ResponseBody MovieReviews getAllMoviesAndTheirReviews() {
        return null;
    }

    @GetMapping("/movies/summary/")
    public @ResponseBody MovieReview getReviewByMovieTitle() {
        return null;
    }

    @GetMapping("/ratings/avg-rating/")
    public @ResponseBody AvgMovieRating getAverageMovieRatingByMovieTitle() {
        return null;
    }

    @GetMapping("/ratings/")
    public @ResponseBody MovieRatings getRatingsByMovieTitle() {
        return null;
    }

    @GetMapping("/reviews/all/")
    public @ResponseBody MovieReviews getAllReviewsByMovieTitle() {
        return null;
    }

    @GetMapping("/reviews/good/")
    public @ResponseBody MovieReviews getAllPositiveReviewsByMovieTitle() {
        return null;
    }

    @GetMapping("/reviews/bad/")
    public @ResponseBody MovieReviews getAllNegativeReviewsByMovieTitle() {
        return null;
    }

    @PostMapping("/publish/new-movie")
    public @ResponseBody MoviePublication publishNewMovie() {
        return null;
    }

    @PostMapping("/publish/movie-review")
    public @ResponseBody ReviewPublication publishNewReviewByMovieTitle() {
        return null;
    }

}
