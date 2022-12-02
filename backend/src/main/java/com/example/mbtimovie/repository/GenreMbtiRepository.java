package com.example.mbtimovie.repository;

import com.example.mbtimovie.domain.GenreMbti;
import com.example.mbtimovie.domain.Mbti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreMbtiRepository extends JpaRepository<GenreMbti, Long> {

    Optional<GenreMbti> findByMbti(Mbti mbti);
}
