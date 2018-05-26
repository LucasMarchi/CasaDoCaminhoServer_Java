package com.casadocaminho.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Doacao;

@Repository
public interface DoacaoRepository extends JpaRepository<Doacao, Long>{

}
