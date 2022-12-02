package com.example.mbtimovie.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class GenreMbti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "mbti_id")
    private Mbti mbti;

    @Column
    private String description;

    @Builder
    public GenreMbti(Genre genre, Mbti mbti, String description) {
        this.genre = genre;
        this.mbti = mbti;
        this.description = description;
    }
}
