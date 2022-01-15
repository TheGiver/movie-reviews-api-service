package com.evilcorp.rottenfalafels.controllers.inquire.reviews.movie_negative_reviews;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.publish.movie.movie_negative_reviews.NegativeMovieReviewsUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NegativeMovieReviewsControllerImpl implements NegativeMovieReviewsController {
    @Override
    public NegativeMovieReviewsUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makeNegativeReviewsUseCase().process(null);
    }
}
