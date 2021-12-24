package org.evilcorp.rottenfalafelsapi.controllers.publish.review;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish/movie-review")
public interface NewMovieReviewController {

    @PostMapping(produces = "application/json")
    ReviewPublicationResponse processRequest(@RequestBody ReviewPublicationRequest request);
}
