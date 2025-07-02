package com.upstreak.habits.service;

import com.upstreak.habits.DTOs.ColorDTO;
import com.upstreak.habits.repository.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {
    @Autowired
    private ColorRepository repository;

    @Override
    public List<ColorDTO> findAll() {
        return repository.findAll().stream().map(c -> new ColorDTO(c.getId(), c.getName())).toList();
    }
}
