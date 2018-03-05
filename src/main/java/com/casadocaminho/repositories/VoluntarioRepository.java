package com.casadocaminho.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casadocaminho.models.Voluntario;

@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long>{

}
