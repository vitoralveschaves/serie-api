package com.app.serie.entity;

import java.util.UUID;

public record SerieDetailDTO(UUID id, String title, String description, Integer season, String imageUrl) {
    public SerieDetailDTO(Serie serie) {
        this(serie.getId(), serie.getTitle(), serie.getDescription(), serie.getSeason(), serie.getImageUrl());
    }
}
