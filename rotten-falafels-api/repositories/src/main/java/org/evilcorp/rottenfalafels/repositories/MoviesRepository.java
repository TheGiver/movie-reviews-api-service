package org.evilcorp.rottenfalafels.repositories;

import org.evilcorp.rottenfalafels.entities.movies.MoviesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesEntity, Long> {
    MoviesEntity findMoviesEntityByTitle(String title);
}
