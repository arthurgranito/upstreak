package com.upstreak.habits.controller;

import com.upstreak.habits.DTOs.ColorDTO;
import com.upstreak.habits.service.ColorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/colors")
public class ColorController {
    @Autowired
    private ColorServiceImpl service;

    @GetMapping
    public ResponseEntity<List<ColorDTO>> getAllColors() {
        List<ColorDTO> colors = service.findAll();
        return ResponseEntity.ok().body(colors);
    }
}
