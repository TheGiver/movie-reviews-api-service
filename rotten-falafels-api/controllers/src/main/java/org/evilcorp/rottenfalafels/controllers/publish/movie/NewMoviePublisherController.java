package org.evilcorp.rottenfalafels.controllers.publish.movie;

import org.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseRequest;
import org.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/publish/new-movie")
public interface NewMoviePublisherController {

    @PostMapping(produces = "application/json")
    MoviePublishingUseCaseResponse processRequest(@RequestBody MoviePublishingUseCaseRequest request);
}
