package org.evilcorp.rottenfalafels.entities.reviews;

import lombok.Getter;
import lombok.Setter;
import org.evilcorp.rottenfalafels.entities.movies.MoviesEntity;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class ReviewsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ref_movie_id")
    private MoviesEntity movie;

    private int rating;

    private String comments;
}
