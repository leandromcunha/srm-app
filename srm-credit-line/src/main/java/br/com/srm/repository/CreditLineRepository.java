package br.com.srm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.entity.CreditLine;

public interface CreditLineRepository extends JpaRepository<CreditLine, Long>{

}
