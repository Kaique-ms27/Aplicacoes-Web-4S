package com.example.galeriaImagens.Infra.repository;

import com.example.galeriaImagens.domain.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image,String> {
}
