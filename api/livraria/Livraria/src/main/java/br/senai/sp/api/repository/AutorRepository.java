package br.senai.sp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.api.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{

}
