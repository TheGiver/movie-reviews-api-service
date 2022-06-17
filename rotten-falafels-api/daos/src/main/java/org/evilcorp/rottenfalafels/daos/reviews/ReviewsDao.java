package org.evilcorp.rottenfalafels.daos.reviews;

import org.evilcorp.rottenfalafels.repositories.RepositoryFactory;

public class ReviewsDao {
    private final RepositoryFactory repositoryFactory;

    public ReviewsDao(RepositoryFactory repositoryFactory) {
        this.repositoryFactory = repositoryFactory;
    }
}
