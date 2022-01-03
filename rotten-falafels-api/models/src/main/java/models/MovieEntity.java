package models;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date releaseDate;

    @OneToMany(mappedBy = "movies", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    private Set<ReviewEntity> reviews;
}
