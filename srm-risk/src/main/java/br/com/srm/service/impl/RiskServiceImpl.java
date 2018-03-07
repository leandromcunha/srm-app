package br.com.srm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import br.com.srm.convert.ConvertRisk;
import br.com.srm.dto.RiskDTO;
import br.com.srm.entity.Risk;
import br.com.srm.exception.SRMTestException;
import br.com.srm.repository.RiskRepository;
import br.com.srm.service.RiskService;

@Service
public class RiskServiceImpl implements RiskService {

    @Autowired
    private RiskRepository riskRepository;

    @Override
    public List<RiskDTO> findAll() {
        List<Risk> risks = this.riskRepository.findAll();
        if( CollectionUtils.isEmpty(risks)) {
            throw new SRMTestException( "Lista de risco vazia! Favor verificar carga na tabela <<TBL_RISK>>." );
        }
        return ConvertRisk.convertToListDTO(risks);
    }
}
