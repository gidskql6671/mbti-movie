package com.example.mbtimovie.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String link;

    @Column
    private String imageLink;

    @Column
    private String director;

    @Column
    private String pubYear;

    @Column
    private Float userRating;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}
