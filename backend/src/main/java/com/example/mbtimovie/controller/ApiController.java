package com.example.mbtimovie.controller;

import com.example.mbtimovie.domain.Genre;
import com.example.mbtimovie.dto.GetDescriptionResponse;
import com.example.mbtimovie.dto.GetGenreResponse;
import com.example.mbtimovie.service.DescriptionService;
import com.example.mbtimovie.service.GenreService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class ApiController {

    private final GenreService genreService;
    private final DescriptionService descriptionService;

    @GetMapping("/genre")
    public GetGenreResponse getGenre(@RequestParam String mbti) {
        Genre genre = genreService.getGenre(mbti);

        return GetGenreResponse.fromEntity(genre);
    }

    @GetMapping("/description")
    public GetDescriptionResponse getDescription(@RequestParam String mbti) {
        String description = descriptionService.getDescription(mbti);

        return new GetDescriptionResponse(description);
    }
}