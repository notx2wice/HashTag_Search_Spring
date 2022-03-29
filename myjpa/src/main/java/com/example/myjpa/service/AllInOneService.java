package com.example.myjpa.service;

import com.example.myjpa.repository.HashTagRepository;
import com.example.myjpa.repository.Movie;
import com.example.myjpa.repository.MovieHashTagRepository;
import com.example.myjpa.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AllInOneService {
    final HashTagRepository hashTagRepository;
    final MovieRepository movieRepository;
    final MovieHashTagRepository movieHashTagRepository;

    @Transactional
    public Long saveMovie(Movie movie){
        Movie savedMovie = movieRepository.save(movie);
        Long savedMovieId = movieRepository.save(movie).getId();
        return savedMovieId;
    }
}
