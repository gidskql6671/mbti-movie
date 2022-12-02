package com.example.mbtimovie.dto;

import com.example.mbtimovie.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Getter
public class GetMovieListResponse {
    @Builder
    @RequiredArgsConstructor
    @Getter
    private static class MovieResponse {
        private final String title;
        private final String link;
        private final String imageLink;
        private final String director;
        private final String pubYear;
        private final Float userRating;
    }

    private List<MovieResponse> movies;

    public static GetMovieListResponse fromEntity(List<Movie> movieList) {
        List<MovieResponse> movieResponseList =
            movieList.stream().map(movie -> MovieResponse.builder()
                    .title(movie.getTitle())
                    .link(movie.getLink())
                    .imageLink(movie.getImageLink())
                    .director(movie.getDirector())
                    .pubYear(movie.getPubYear())
                    .userRating(movie.getUserRating())
                    .build()
            ).toList();

        return new GetMovieListResponse(movieResponseList);
    }
}
