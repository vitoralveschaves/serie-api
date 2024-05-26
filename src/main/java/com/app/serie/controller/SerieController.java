package com.app.serie.controller;

import com.app.serie.entity.SerieDTO;
import com.app.serie.entity.SerieDetailDTO;
import com.app.serie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/serie")
public class SerieController {
    @Autowired
    private SerieService serieService;

    @PostMapping
    public SerieDetailDTO save(@RequestBody SerieDTO serieDto) {
        return this.serieService.saveSerie(serieDto);
    }

    @GetMapping
    public List<SerieDetailDTO> get() {
        return this.serieService.getAllSeries();
    }

    @DeleteMapping
    public void delete(@RequestParam UUID id) {
        System.out.println(id);
        this.serieService.deleteSerieById(id);
    }
}
