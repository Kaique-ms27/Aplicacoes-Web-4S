package com.example.galeriaImagens;

import com.example.galeriaImagens.Infra.repository.ImageRepository;
import com.example.galeriaImagens.enuns.ImageExtension;

import com.example.galeriaImagens.domain.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GaleriaImagensApplication {

    @Bean
    public CommandLineRunner commandLineRunner(@Autowired ImageRepository repository) {
        return args -> {
            Image image = Image
                    .builder()
                    .extension(ImageExtension.PNG)
                    .name("MyImage")
                    .tags("teste")
                    .size(1000L)
                    .build();

            repository.save(image);
        };
    }

	public static void main(String[] args) {
		SpringApplication.run(GaleriaImagensApplication.class, args);
	}

}
