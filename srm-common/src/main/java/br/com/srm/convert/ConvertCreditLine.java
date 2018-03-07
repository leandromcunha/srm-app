package br.com.srm.convert;

import br.com.srm.dto.CreditLineDTO;
import br.com.srm.entity.CreditLine;

public class ConvertCreditLine {

    public static CreditLine convertToEntity( final CreditLineDTO creditLineDTO ) {
        CreditLine creditLine = new CreditLine();
        creditLine.setCreditLineId(creditLineDTO.getCreditLineId());
        creditLine.setCreditLine(creditLineDTO.getCreditLine());
        creditLine.setCustomer(creditLineDTO.getCustomer());
        creditLine.setRisk(ConvertRisk.convertToEntity( creditLineDTO.getRisk()));
        return creditLine;
    }

    public static CreditLineDTO convertToDTO( final CreditLine creditLine ) {
        CreditLineDTO creditLineDTO = new CreditLineDTO();
        creditLineDTO.setCreditLineId(creditLine.getCreditLineId());
        creditLineDTO.setCreditLine(creditLine.getCreditLine());
        creditLineDTO.setCustomer(creditLine.getCustomer());
        creditLineDTO.setRisk(ConvertRisk.convertToDTO( creditLine.getRisk()));
        return creditLineDTO;
    }
}