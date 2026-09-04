package com.example.galeriaImagens.domain.service;

import com.example.galeriaImagens.domain.model.Image;

import java.util.Optional;

public interface ImageService {
    Image save (Image image);

    Optional<Image> getById(String id);
}
