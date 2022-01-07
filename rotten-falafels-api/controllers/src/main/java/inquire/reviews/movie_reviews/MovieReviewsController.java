package inquire.reviews.movie_reviews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/reviews/all")
public interface MovieReviewsController {

    @GetMapping(produces = "application/json")
    Reviews processRequest(@RequestParam String title);
}
