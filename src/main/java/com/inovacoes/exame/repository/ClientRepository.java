package com.inovacoes.exame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.Clientmodel;

@Repository
public interface ClientRepository extends JpaRepository<Clientmodel, Long> {
}
