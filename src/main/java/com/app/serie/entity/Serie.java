package com.app.serie.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private Integer season;
    private String imageUrl;

    public Serie(SerieDTO serieDto) {
        this.title = serieDto.title();
        this.description = serieDto.description();
        this.season = serieDto.season();
        this.imageUrl = serieDto.imageUrl();
    }
}
