package com.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_positive_reviews;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_positive_reviews.PositiveMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PositiveMovieReviewsControllerImpl implements PositiveMovieReviewsController {
    @Override
    public PositiveMovieReviewsUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makePositiveMovieReviewsUseCase().process(null);
    }
}
