package com.example.mbtimovie.dto;

import com.example.mbtimovie.domain.Genre;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class GetGenreResponse {
    private final String genre;

    public static GetGenreResponse fromEntity(Genre genre) {
        return GetGenreResponse.builder()
                .genre(genre.getName())
                .build();
    }
}
