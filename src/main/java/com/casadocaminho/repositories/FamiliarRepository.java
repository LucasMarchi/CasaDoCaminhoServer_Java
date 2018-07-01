package com.casadocaminho.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Familiar;

@Repository
public interface FamiliarRepository extends JpaRepository<Familiar, Long>{

	List<Familiar> findByIdadeAndTamanhoCalcado(Long idade, Long tamanhoCalcado);

}
