package org.evilcorp.rottenfalafelsapi.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Min(0)
    @Max(10)
    private Integer rating;

    @Size(max = 500)
    @Column(length = 500)
    private String comment;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private MovieEntity movie;
}
