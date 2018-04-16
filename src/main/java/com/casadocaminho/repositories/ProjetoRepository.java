package com.casadocaminho.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Projeto;
import com.casadocaminho.models.Voluntario;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long>{
	
}
