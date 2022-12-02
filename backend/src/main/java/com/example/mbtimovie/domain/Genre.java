package com.example.mbtimovie.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "genre")
    private List<GenreMbti> genreMbti = new ArrayList<>();

    @Builder
    public Genre(String name) {
        this.name = name;
    }
}
