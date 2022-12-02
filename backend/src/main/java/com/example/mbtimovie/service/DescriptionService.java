package com.example.mbtimovie.service;

import com.example.mbtimovie.domain.Genre;
import com.example.mbtimovie.domain.GenreMbti;
import com.example.mbtimovie.domain.Mbti;
import com.example.mbtimovie.exception.NotFoundException;
import com.example.mbtimovie.repository.GenreMbtiRepository;
import com.example.mbtimovie.repository.MbtiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DescriptionService {

    private final MbtiRepository mbtiRepository;
    private final GenreMbtiRepository genreMbtiRepository;

    public String getDescription(String mbtiName) {
        Mbti mbti = mbtiRepository.findByName(mbtiName).orElseThrow(NotFoundException::new);
        GenreMbti genreMbti = genreMbtiRepository.findByMbti(mbti).orElseThrow(NotFoundException::new);

        return genreMbti.getDescription();
    }
}
