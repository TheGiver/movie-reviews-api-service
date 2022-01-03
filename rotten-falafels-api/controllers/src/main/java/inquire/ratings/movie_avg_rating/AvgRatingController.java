package inquire.ratings.movie_avg_rating;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings/avg-rating")
public interface AvgRatingController {

    @GetMapping(produces = "application/json")
    AvgMovieRating processRequest(@RequestParam String title);
}
