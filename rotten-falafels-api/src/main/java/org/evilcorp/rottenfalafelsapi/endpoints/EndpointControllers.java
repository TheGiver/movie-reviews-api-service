package org.evilcorp.rottenfalafelsapi.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointControllers implements Endpoints {

    @GetMapping("/movies/summary/all")
    @ResponseBody
    public MovieReviews getAllMoviesAndTheirReviewsController() {
        return null;
    }

    @GetMapping("/movies/summary")
    @ResponseBody
    public MovieReview getReviewByMovieTitleController() {
        return null;
    }

    @GetMapping("/ratings/avg-rating")
    @ResponseBody
    public AvgMovieRating getAverageMovieRatingByMovieTitleController() {
        return null;
    }

    @GetMapping("/ratings")
    @ResponseBody
    public MovieRatings getRatingsByMovieTitleController() {
        return null;
    }

    @GetMapping("/reviews/all")
    @ResponseBody
    public Reviews getAllReviewsByMovieTitleController() {
        return null;
    }

    @GetMapping("/reviews/good")
    @ResponseBody
    public Reviews getAllPositiveReviewsByMovieTitleController() {
        return null;
    }

    @GetMapping("/reviews/bad")
    @ResponseBody
    public Reviews getAllNegativeReviewsByMovieTitleController() {
        return null;
    }

    @PostMapping("/publish/new-movie")
    @ResponseBody
    public MoviePublication publishNewMovieController() {
        return null;
    }

    @PostMapping("/publish/movie-review")
    @ResponseBody
    public ReviewPublication publishNewReviewByMovieTitleController() {
        return null;
    }

}
