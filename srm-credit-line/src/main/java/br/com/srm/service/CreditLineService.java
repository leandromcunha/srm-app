package br.com.srm.service;

import br.com.srm.dto.CreditLineDTO;
import br.com.srm.dto.ResponseDTO;

public interface CreditLineService {

    public ResponseDTO add( final CreditLineDTO creditLineDTO );

}
