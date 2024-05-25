package com.app.serie.repository;

import com.app.serie.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SerieRepository extends JpaRepository<Serie, UUID> {
}
