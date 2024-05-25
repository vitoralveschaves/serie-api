package com.app.serie.service;

import com.app.serie.entity.Serie;
import com.app.serie.entity.SerieDTO;
import com.app.serie.entity.SerieDetailDTO;
import com.app.serie.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    public SerieDetailDTO saveSerie(SerieDTO serieDto) {
        Serie serie = new Serie(serieDto);
        this.serieRepository.save(serie);
        return new SerieDetailDTO(serie);
    }

}
