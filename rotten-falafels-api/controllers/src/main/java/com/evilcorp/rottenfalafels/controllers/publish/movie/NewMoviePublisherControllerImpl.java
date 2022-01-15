package com.evilcorp.rottenfalafels.controllers.publish.movie;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseRequest;
import com.evilcorp.rottenfalafels.usecases.publish.movie.MoviePublishingUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewMoviePublisherControllerImpl implements NewMoviePublisherController {

    @Override
    public MoviePublishingUseCaseResponse processRequest(MoviePublishingUseCaseRequest request) {
        return new UseCaseFactory().makeMoviePublishingUseCase().process(request);
    }
}
