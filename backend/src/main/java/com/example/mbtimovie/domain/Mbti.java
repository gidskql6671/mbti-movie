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
public class Mbti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "mbti")
    private List<GenreMbti> genreMbti = new ArrayList<>();

    @Builder
    public Mbti(String name) {
        this.name = name;
    }
}
