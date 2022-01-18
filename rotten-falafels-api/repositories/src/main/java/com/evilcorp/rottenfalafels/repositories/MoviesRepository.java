package com.evilcorp.rottenfalafels.repositories;

import com.evilcorp.rottenfalafels.entities.movies.MoviesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesEntity, Long> {

    Optional<List<MoviesEntity>> getAllMoviesAndTheirReviews();

    Optional<MoviesEntity> getMovieAndItsReviewByMovieTitle(String title);

    Optional<MoviesEntity> getAvgRatingByMovieTitle(String title);
}
