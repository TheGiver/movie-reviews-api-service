package com.evilcorp.rottenfalafels.controllers.inquire.movies.movies_summary;

import com.evilcorp.rottenfalafels.usecases.inquire.movies.movies_summary.MoviesSummaryUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/movies/summary/all")
public interface MoviesSummariesController {

    @GetMapping(produces = "application/json")
    MoviesSummaryUseCaseResponse processRequest();
}
