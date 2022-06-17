package org.evilcorp.rottenfalafels.controllers.publish.review;

import org.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseRequest;
import org.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseResponse;
import org.evilcorp.rottenfalafels.usecases.publish.review.MovieReviewPublishingUseCaseRequest;
import org.evilcorp.rottenfalafels.usecases.publish.review.MovieReviewPublishingUseCaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/publish/movie-review")
public interface NewMovieReviewController {

    @PostMapping(produces = "application/json")
    MovieReviewPublishingUseCaseResponse processRequest(@RequestBody MovieReviewPublishingUseCaseRequest request);
}
