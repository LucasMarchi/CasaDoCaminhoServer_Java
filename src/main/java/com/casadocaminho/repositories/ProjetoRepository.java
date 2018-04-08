package com.casadocaminho.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{

}
