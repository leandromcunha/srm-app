package br.com.srm.service;

import java.util.List;

import br.com.srm.dto.RiskDTO;

public interface RiskService  {
    List<RiskDTO> findAll();
}
