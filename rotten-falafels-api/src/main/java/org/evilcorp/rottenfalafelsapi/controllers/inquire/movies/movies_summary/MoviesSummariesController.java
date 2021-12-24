package org.evilcorp.rottenfalafelsapi.controllers.inquire.movies.movies_summary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies/summary/all")
public interface MoviesSummariesController {

    @GetMapping(produces = "application/json")
    MovieReviews processRequest();
}
