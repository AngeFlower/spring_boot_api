package com.ksquad.crud.cours.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ksquad.crud.cours.entity.coursEntity;
import com.ksquad.crud.cours.repository.coursRepository;

@Service
public class coursService {
    @Autowired
    private coursRepository courRepository;

    public coursEntity createCour(coursEntity cour) {
        coursEntity courSaved = courRepository.save(cour);
        return courSaved;
    }

    public coursEntity updateCour(Long id, coursEntity course) {
        Optional<coursEntity> cour = courRepository.findById(id);
        if (cour.isPresent()) {
            coursEntity courfind = cour.get();
            courfind.setName(course.getName());
            courfind.setPoints(course.getPoints());
            return courRepository.save(courfind);
        } else {
            return null;
        }
    }

    public coursEntity getById(Long id) {
        Optional<coursEntity> cour = courRepository.findById(id);
        if (cour.isPresent()) {
            return cour.get();
        } else {
            return null;
        }
    }

    public Boolean deleteById(Long id) {
        Optional<coursEntity> cour = courRepository.findById(id);
        if (cour.isPresent()) {
            courRepository.delete(cour.get());
            return true;
        } else {
            return false;
        }
    }

    public List<coursEntity> getAll() {
        return courRepository.findAll();
    }
}