package com.evilcorp.rottenfalafels.controllers.publish.review;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.publish.review.MovieReviewPublishingUseCaseRequest;
import com.evilcorp.rottenfalafels.usecases.publish.review.MovieReviewPublishingUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewMovieReviewControllerImpl implements NewMovieReviewController {

    @Override
    public MovieReviewPublishingUseCaseResponse processRequest(MovieReviewPublishingUseCaseRequest request) {
        return new UseCaseFactory().makeMovieReviewPublishingUseCase().process(request);
    }
}
