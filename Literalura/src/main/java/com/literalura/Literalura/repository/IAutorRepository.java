package com.literalura.Literalura.repository;

import com.literalura.Literalura.model.Autor;
import com.literalura.Literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IAutorRepository extends JpaRepository<Autor,Long> {

    List<Autor> findAll();

    List<Autor> findByCumpleaniosLessThanOrFechaFallecimientoGreaterThanEqual(int anioBuscado, int anioBuscado1);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}