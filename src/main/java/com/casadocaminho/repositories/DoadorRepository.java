package com.casadocaminho.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Doador;

@Repository
public interface DoadorRepository extends JpaRepository<Doador, Long>{

}
