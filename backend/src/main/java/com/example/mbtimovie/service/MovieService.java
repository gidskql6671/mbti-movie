package com.example.mbtimovie.service;

import com.example.mbtimovie.domain.Genre;
import com.example.mbtimovie.domain.GenreMbti;
import com.example.mbtimovie.domain.Mbti;
import com.example.mbtimovie.domain.Movie;
import com.example.mbtimovie.exception.NotFoundException;
import com.example.mbtimovie.repository.GenreMbtiRepository;
import com.example.mbtimovie.repository.MbtiRepository;
import com.example.mbtimovie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MbtiRepository mbtiRepository;
    private final GenreMbtiRepository genreMbtiRepository;
//    private final MovieRepository movieRepository;

    public List<Movie> getMovies(String mbtiName) {
        Mbti mbti = mbtiRepository.findByName(mbtiName).orElseThrow(NotFoundException::new);
        GenreMbti genreMbti = genreMbtiRepository.findByMbti(mbti).orElseThrow(NotFoundException::new);
        Genre genre = genreMbti.getGenre();

        return genre.getMovies();
    }
}
