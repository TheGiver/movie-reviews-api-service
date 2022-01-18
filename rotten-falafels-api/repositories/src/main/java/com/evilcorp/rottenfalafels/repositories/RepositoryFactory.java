package com.evilcorp.rottenfalafels.repositories;

public interface RepositoryFactory {
    MoviesRepository connectToMoviesRepository();
    ReviewsRepository connectToReviewsRepository();
}
