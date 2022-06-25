package org.evilcorp.rottenfalafels.repositories;

public interface RepositoryFactory {
    public ReviewsRepository getReviewRepository();

    public MoviesRepository getMoviesRepository();
}
