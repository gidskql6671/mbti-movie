package com.example.mbtimovie.repository;

import com.example.mbtimovie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
