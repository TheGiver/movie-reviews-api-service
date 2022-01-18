package com.evilcorp.rottenfalafels.entities.movies;

import com.evilcorp.rottenfalafels.entities.reviews.ReviewsEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
public class MoviesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @OneToMany(targetEntity = ReviewsEntity.class)
    private List<ReviewsEntity> reviews;
}
