package br.com.srm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srm.dto.CreditLineDTO;
import br.com.srm.dto.ResponseDTO;
import br.com.srm.service.CreditLineService;

@RestController
@RequestMapping("/creditline")
public class CreditLineController {

    @Autowired
    private CreditLineService creditLineService;

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseDTO add( @RequestBody final CreditLineDTO creditLineDTO ) {
        return this.creditLineService.add(creditLineDTO);
    }
}