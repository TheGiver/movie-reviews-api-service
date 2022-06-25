package org.evilcorp.rottenfalafels.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryFactoryImpl implements RepositoryFactory {
    @Autowired
    private final MoviesRepository moviesRepository;

    @Autowired 
    private final ReviewsRepository reviewsRepository;

    @Override
    public ReviewsRepository getReviewRepository() {
        return reviewsRepository;
    }

    @Override
    public MoviesRepository getMoviesRepository() {
        moviesRepository;
    }
}
