package com.evilcorp.rottenfalafels.controllers.inquire.movies.movie_summary;

import com.evilcorp.rottenfalafels.usecases.inquire.movies.movie_summary.MovieSummaryUseCaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/movies/summary")
public interface MovieSummaryController {

    @GetMapping(produces = "application/json")
    MovieSummaryUseCaseResponse processRequest(@RequestParam String title);

}
