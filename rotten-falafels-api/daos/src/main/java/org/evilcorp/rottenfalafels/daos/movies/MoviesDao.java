package org.evilcorp.rottenfalafels.daos.movies;

import org.evilcorp.rottenfalafels.repositories.RepositoryFactory;

public class MoviesDao {
    private final RepositoryFactory repositoryFactory;

    public MoviesDao(RepositoryFactory repositoryFactory) {
        this.repositoryFactory = repositoryFactory;
    }
}
