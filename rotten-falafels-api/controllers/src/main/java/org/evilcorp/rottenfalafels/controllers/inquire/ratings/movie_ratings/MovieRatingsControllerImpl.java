package org.evilcorp.rottenfalafels.controllers.inquire.ratings.movie_ratings;

import org.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import org.evilcorp.rottenfalafels.usecases.inquire.ratings.movie_ratings.MovieRatingsUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRatingsControllerImpl implements MovieRatingsController {
    @Override
    public MovieRatingsUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makeMovieRatingsUseCase().process(null);
    }
}
