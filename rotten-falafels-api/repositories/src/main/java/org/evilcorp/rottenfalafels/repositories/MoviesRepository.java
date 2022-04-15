package org.evilcorp.rottenfalafels.repositories;

import org.evilcorp.rottenfalafels.entities.MoviesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesEntity, Long> {
    MoviesEntity findBy
}
