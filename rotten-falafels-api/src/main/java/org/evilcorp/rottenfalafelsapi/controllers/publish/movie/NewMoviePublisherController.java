package org.evilcorp.rottenfalafelsapi.controllers.publish.movie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish/new-movie")
public interface NewMoviePublisherController {

    @PostMapping(produces = "application/json")
    MoviePublicationResponse processRequest(@RequestBody MoviePublicationRequest request);
}
