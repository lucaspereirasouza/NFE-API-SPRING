package com.inovacoes.exame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.Productmodel;

@Repository
public interface ProductRepository extends JpaRepository<Productmodel, Long> {

}
