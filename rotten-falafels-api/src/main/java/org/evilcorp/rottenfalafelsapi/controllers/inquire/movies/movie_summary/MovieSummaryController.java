package org.evilcorp.rottenfalafelsapi.controllers.inquire.movies.movie_summary;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies/summary")
public interface MovieSummaryController {

    @GetMapping(produces = "application/json")
    MovieReview processRequest(@RequestParam String title);

}
