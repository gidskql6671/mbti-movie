package com.example.mbtimovie.repository;

import com.example.mbtimovie.domain.Mbti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MbtiRepository extends JpaRepository<Mbti, Long> {

    Optional<Mbti> findByName(String name);
}
