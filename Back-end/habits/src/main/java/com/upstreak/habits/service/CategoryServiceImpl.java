package com.upstreak.habits.service;

import com.upstreak.habits.DTOs.CategoryDTO;
import com.upstreak.habits.model.Category;
import com.upstreak.habits.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository repository;

    @Override
    public List<CategoryDTO> findAll() {
        return repository.findAll().stream().map(c -> new CategoryDTO(c.getId(), c.getName())).toList();
    }
}
