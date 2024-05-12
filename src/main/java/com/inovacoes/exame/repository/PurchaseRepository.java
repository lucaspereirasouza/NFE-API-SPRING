package com.inovacoes.exame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.Purchasemodel;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchasemodel, Long>{
}
