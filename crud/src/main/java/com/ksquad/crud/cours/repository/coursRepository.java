package com.ksquad.crud.cours.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ksquad.crud.cours.entity.coursEntity;

public interface coursRepository extends JpaRepository<coursEntity, Long> {

}
