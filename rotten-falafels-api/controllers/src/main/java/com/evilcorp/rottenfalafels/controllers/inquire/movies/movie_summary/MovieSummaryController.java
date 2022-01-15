package com.evilcorp.rottenfalafels.controllers.inquire.movies.movie_summary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/movies/summary")
public interface MovieSummaryController {

    @GetMapping(produces = "application/json")
    MovieReview processRequest(@RequestParam String title);

}
