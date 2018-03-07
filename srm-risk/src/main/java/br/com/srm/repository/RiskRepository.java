package br.com.srm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.srm.entity.Risk;

public interface RiskRepository extends JpaRepository<Risk, Long> {

}
