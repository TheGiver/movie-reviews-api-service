package org.evilcorp.rottenfalafels.controllers.inquire.ratings.movie_avg_rating;

import org.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import org.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_avg_rating.AvgMovieRatingUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvgRatingControllerImpl implements AvgRatingController {
    @Override
    public AvgMovieRatingUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makeAvgMovieRatingUseCase().process(null);
    }
}
