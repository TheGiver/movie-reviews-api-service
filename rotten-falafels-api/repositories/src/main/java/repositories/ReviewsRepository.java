package repositories;

import org.evilcorp.rottenfalafelsapi.models.ReviewEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends CrudRepository<ReviewEntity, Long> {

}
