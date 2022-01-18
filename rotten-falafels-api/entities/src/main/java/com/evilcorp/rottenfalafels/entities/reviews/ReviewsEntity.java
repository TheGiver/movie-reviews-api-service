package com.evilcorp.rottenfalafels.entities.reviews;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
public class ReviewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Size(min = 0, max = 10)
    @Column(length = 10)
    private int rating;

    private String comment;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    private long movieId;
}
