package inquire.ratings.movie_ratings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/rating")
public interface MovieRatingsController {

    @GetMapping(produces = "application/json")
    MovieRatings processRequest(@RequestParam String title);
}
