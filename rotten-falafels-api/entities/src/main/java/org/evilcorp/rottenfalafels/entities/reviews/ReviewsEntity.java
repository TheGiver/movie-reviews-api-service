package org.evilcorp.rottenfalafels.entities.reviews;

import org.evilcorp.rottenfalafels.entities.movies.MoviesEntity;

import javax.persistence.*;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MoviesEntity getMovieId() {
        return movie;
    }

    public void setMovieId(MoviesEntity movie) {
        this.movie = movie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
