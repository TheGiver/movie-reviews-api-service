package com.evilcorp.rottenfalafels.repositories;

import com.evilcorp.rottenfalafels.entities.reviews.ReviewsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends CrudRepository<ReviewsEntity, Long> {

}
