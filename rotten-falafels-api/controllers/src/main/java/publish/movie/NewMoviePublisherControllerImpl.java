package publish.movie;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewMoviePublisherControllerImpl implements NewMoviePublisherController {
    @Override
    public MoviePublicationResponse processRequest(MoviePublicationRequest request) {
        return null;
    }
}
