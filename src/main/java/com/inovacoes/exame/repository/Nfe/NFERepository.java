package com.inovacoes.exame.repository.Nfe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovacoes.exame.model.NFe.Nfeproc;

@Repository
public interface NFERepository extends JpaRepository<Nfeproc, Long> {

}
