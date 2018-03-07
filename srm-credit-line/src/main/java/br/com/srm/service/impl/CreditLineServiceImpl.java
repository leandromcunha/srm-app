package br.com.srm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.srm.convert.ConvertCreditLine;
import br.com.srm.dto.CreditLineDTO;
import br.com.srm.dto.ResponseDTO;
import br.com.srm.exception.SRMTestException;
import br.com.srm.repository.CreditLineRepository;
import br.com.srm.service.CreditLineService;
import br.com.srm.util.ResponseFactory;

@Service
public class CreditLineServiceImpl implements CreditLineService {

    @Autowired
    private CreditLineRepository creditLineRepository;

    @Override
    @Transactional
    public ResponseDTO add(final CreditLineDTO creditLineDTO) {
        try {
            this.creditLineRepository.saveAndFlush( ConvertCreditLine.convertToEntity(creditLineDTO));
            return ResponseFactory.newInstance("Linha de crédito incluida com sucesso!");
        }catch (Exception e) {
            throw new SRMTestException("Erro ao tentar gravar a linha de credito",e);
        }
    }
}