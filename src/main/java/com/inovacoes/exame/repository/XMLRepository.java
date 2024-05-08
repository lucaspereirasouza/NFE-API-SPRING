package com.inovacoes.exame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.XMLModel;

@Repository
public interface XMLRepository extends JpaRepository<XMLModel, Long> {

//	List<XMLModel> findByPublished(boolean published);
//	List<XMLModel> findByTitleContaining(String title);
}
