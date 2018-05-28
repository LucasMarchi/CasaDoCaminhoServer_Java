package com.casadocaminho.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Doador;

@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long>{

	Optional<Doador> findByDocumento(String documento);

}
