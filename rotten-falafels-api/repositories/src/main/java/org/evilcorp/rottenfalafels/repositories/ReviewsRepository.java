package org.evilcorp.rottenfalafels.repositories;

import org.evilcorp.rottenfalafels.entities.reviews.ReviewsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends CrudRepository<ReviewsEntity, Long> {
    @Query("SELECT AVG(rating) FROM reviews r WHERE r.ref_movie_id = :movieId")
    Long findAvgRatingByMovieId(@Param("movieId") Long movieId);

    ReviewsEntity findAllReviewsEntityByMovieId(Long movieId);

    // TODO 
    // The value 6 needs to be dynamically configurable as it might change over time
    @Query("SELECT * FROM reviews r WHERE r.rating >= 6 AND r.ref_movie_id = :movieId")
    ReviewsEntity findAllPositiveReviewsByMovieId(@Param("movieId") Long movieId);

    // TODO 
    // The value 5 needs to be dynamically configurable as it might change over time
    @Query("SELECT * FROM reviews r WHERE r.rating <= 5 AND r.ref_movie_id = :movieId")
    ReviewsEntity findAllNegativeReviewsByMoviesId(@Param("movieId") Long movieId);
}