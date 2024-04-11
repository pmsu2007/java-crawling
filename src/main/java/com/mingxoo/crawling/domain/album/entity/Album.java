package com.mingxoo.crawling.domain.album.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "ALBUMS")
public class Album {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
}
