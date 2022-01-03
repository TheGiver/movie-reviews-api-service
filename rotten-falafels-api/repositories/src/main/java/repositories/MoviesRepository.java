package repositories;

import org.evilcorp.rottenfalafelsapi.models.MovieEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepository extends CrudRepository<MovieEntity, Long> {

}
