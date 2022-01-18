package com.evilcorp.rottenfalafels.repositories;

import com.evilcorp.rottenfalafels.entities.movies.MoviesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<MoviesEntity, Long> {

}
