package br.com.srm.convert;

import java.util.ArrayList;
import java.util.List;

import br.com.srm.dto.RiskDTO;
import br.com.srm.entity.Risk;

public class ConvertRisk {

    public static List<RiskDTO> convertToListDTO( final List<Risk> risks ){
        List<RiskDTO> riskDTOs = new ArrayList<>();
        for (Risk risk : risks) {
            riskDTOs.add( ConvertRisk.convertToDTO(risk));
        }
        return riskDTOs;
    }


    public static Risk convertToEntity( final RiskDTO riskDTO ) {
        Risk risk = new Risk();
        risk.setDescription( riskDTO.getDescription());
        risk.setRate( riskDTO.getRate());
        risk.setRiskId(riskDTO.getRiskId());
        return risk;
    }

    public static RiskDTO convertToDTO( final Risk risk ) {
        RiskDTO riskDTO = new RiskDTO();
        riskDTO.setDescription( risk.getDescription());
        riskDTO.setRate( risk.getRate());
        riskDTO.setRiskId(risk.getRiskId());
        return riskDTO;
    }
}
