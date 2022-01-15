package com.evilcorp.rottenfalafels.controllers.inquire.movies.movies_summary;

import com.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.MoviesSummaryUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesSummariesControllerImpl implements MoviesSummariesController {
    @Override
    public MoviesSummaryUseCaseResponse processRequest() {
        return new UseCaseFactory().makeMoviesSummaryUseCase().process(null);
    }
}
