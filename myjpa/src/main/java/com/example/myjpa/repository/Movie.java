package com.example.myjpa.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.concurrent.ConcurrentHashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String title;

    private String director;

    @OneToMany(mappedBy = "movie")
    private ConcurrentHashMap<String, MovieHashTag> movieHashTags = new ConcurrentHashMap<>();
}
