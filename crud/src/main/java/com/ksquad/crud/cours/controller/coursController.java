package com.ksquad.crud.cours.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ksquad.crud.cours.entity.coursEntity;
import com.ksquad.crud.cours.service.coursService;

@RestController
@RequestMapping("/cours")
public class coursController {
    @Autowired
    private coursService cour;

    @PostMapping
    public coursEntity createCour(@RequestBody coursEntity cours) {
        return cour.createCour(cours);
    }

    @PutMapping("/{id}")
    public coursEntity updateCour(@PathVariable("id") Long id, @RequestBody coursEntity cours) {
        return cour.updateCour(id, cours);
    }

    @GetMapping("/{id}")
    public coursEntity getById(@PathVariable("id") Long id) {
        return cour.getById(id);
    }

    @GetMapping
    public List<coursEntity> getAll() {
        return cour.getAll();
    }

    @DeleteMapping("/{id}")
    public Boolean deleteById(@PathVariable("id") Long id) {
        return cour.deleteById(id);
    }

}
