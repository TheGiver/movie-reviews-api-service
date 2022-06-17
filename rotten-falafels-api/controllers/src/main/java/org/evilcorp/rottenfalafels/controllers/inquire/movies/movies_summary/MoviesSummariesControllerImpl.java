package org.evilcorp.rottenfalafels.controllers.inquire.movies.movies_summary;

import org.evilcorp.rottenfalafels.usecases.UseCaseFactory;
import org.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.MoviesSummaryUseCaseResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoviesSummariesControllerImpl implements MoviesSummariesController {
    @Override
    public MoviesSummaryUseCaseResponse processRequest() {
        return new UseCaseFactory().makeMoviesSummaryUseCase().process(null);
    }
}
