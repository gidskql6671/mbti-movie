package com.example.mbtimovie.repository;

import com.example.mbtimovie.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
