package com.evilcorp.rottenfalafels.daos.movies;

import com.evilcorp.rottenfalafels.repositories.RepositoryFactory;

public class MoviesDao {
    private final RepositoryFactory repositoryFactory;

    public MoviesDao(RepositoryFactory repositoryFactory) {
        this.repositoryFactory = repositoryFactory;
    }
}
