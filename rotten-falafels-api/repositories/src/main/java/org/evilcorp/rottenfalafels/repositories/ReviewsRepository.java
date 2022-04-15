package org.evilcorp.rottenfalafels.repositories;

import org.evilcorp.rottenfalafels.entities.ReviewsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends CrudRepository<ReviewsEntity, Long> {

}
