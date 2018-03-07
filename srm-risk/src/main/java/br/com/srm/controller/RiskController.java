package br.com.srm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.srm.dto.RiskDTO;
import br.com.srm.service.RiskService;

@RestController
@RequestMapping("/risk")
public class RiskController {


    @Autowired
    private RiskService riskService;


    @GetMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public List<RiskDTO> risk() {
        return this.riskService.findAll();
    }
}
