package org.evilcorp.rottenfalafels.entities.movies;

import lombok.Getter;
import lombok.Setter;
import org.evilcorp.rottenfalafels.entities.reviews.ReviewsEntity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "movies")
public class MoviesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Column(name = "release_date")
    private Date releaseDate;

    @OneToMany(mappedBy = "movie")
    private Set<ReviewsEntity> reviews;
}
