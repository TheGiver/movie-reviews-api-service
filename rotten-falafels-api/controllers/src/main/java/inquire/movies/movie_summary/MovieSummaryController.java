package inquire.movies.movie_summary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies/summary")
public interface MovieSummaryController {

    @GetMapping(produces = "application/json")
    MovieReview processRequest(@RequestParam String title);

}
