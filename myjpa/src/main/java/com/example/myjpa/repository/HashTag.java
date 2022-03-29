package com.example.myjpa.repository;

import lombok.*;
import javax.persistence.*;
import java.util.concurrent.ConcurrentHashMap;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class HashTag {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long count;

    @OneToMany(mappedBy = "hashTag")
    private ConcurrentHashMap<String, MovieHashTag> movieHashTags = new ConcurrentHashMap<>();
}
