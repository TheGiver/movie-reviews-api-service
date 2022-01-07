package publish.movie;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/publish/new-movie")
public interface NewMoviePublisherController {

    @PostMapping(produces = "application/json")
    MoviePublicationResponse processRequest(@RequestBody MoviePublicationRequest request);
}
