package com.evilcorp.rottenfalafels.controllers.inquire.movies.movie_summary;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.MovieSummaryUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieSummaryControllerImpl implements MovieSummaryController {

    @Override
    public MovieSummaryUseCaseResponse processRequest(String title) {
        return new UseCaseFactory().makeMovieSummaryUseCase().process(null);
    }
}
