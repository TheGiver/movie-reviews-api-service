package org.evilcorp.rottenfalafelsapi.models;

import javax.persistence.*;

@Entity
@Table(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Integer rating;

    private String comment;
}
