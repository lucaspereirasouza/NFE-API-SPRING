package com.inovacoes.exame.repository.teste;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.teste.Nfe;
import com.inovacoes.exame.model.teste.Nfeproc;

@Repository
public interface NFERepository extends JpaRepository<Nfeproc, Long> {

}
