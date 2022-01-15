package com.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_reviews;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.inquire.reviews.movie_reviews.AllMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieReviewsControllerImpl implements MovieReviewsController {
    @Override
    public AllMovieReviewsUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makeAllMovieReviewsUseCase().process(null);
    }
}
