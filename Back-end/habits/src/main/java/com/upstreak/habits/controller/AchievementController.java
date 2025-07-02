package com.upstreak.habits.controller;

import com.upstreak.habits.DTOs.AchievementDTO;
import com.upstreak.habits.DTOs.UserAchievementDTO;
import com.upstreak.habits.model.UserAchievement;
import com.upstreak.habits.service.AchievementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/achievements")
public class AchievementController {
    @Autowired
    private AchievementServiceImpl service;

    @GetMapping
    public List<AchievementDTO> getAllAchievements() {
        return service.findAll();
    }

    @GetMapping("/user/{id}")
    public List<UserAchievementDTO> getUserAchievements(@PathVariable Long id) {
        return service.getUserAchievements(id);
    }
}
