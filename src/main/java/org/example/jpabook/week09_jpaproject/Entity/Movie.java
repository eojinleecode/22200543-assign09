package org.example.jpabook.week09_jpaproject.Entity.

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(length = 100)
    private String director;

    @Column(length = 50)
    private String genre;

    @Column
    private Double rating;

    @Column
    private Integer releaseYear;

    @Column
    private Integer runningTime;
}