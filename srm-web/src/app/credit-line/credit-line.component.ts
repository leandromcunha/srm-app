import { Component, OnInit } from '@angular/core';
import { RiskService } from '../risk/risk.service';
import { CreditLineService } from './credit-line.service';
import { Response } from '../response/response.model';
import { CreditLine } from './credit-line.model';
import { Risk } from '../risk/risk.model';
import { RISK_LIST } from '../../app.api';


@Component({
  selector: 'srm-credit-line',
  templateUrl: './credit-line.component.html'
})

export class CreditLineComponent implements OnInit {

  constructor(private riskService: RiskService, private creditLineService: CreditLineService) { }

  riskList: Risk[] = []
  rate: string = "-";
  riskFind: Risk;
  response: Response;

  ngOnInit() {
    this.rate = "-";
    this.riskService.riskList()
      .subscribe(riskList => this.riskList = riskList)
  }

  onChange(description: string) {
    this.riskFind = this.riskList.find(element => element.description === description);
    this.rate = "-";
    if (this.riskFind.rate !== undefined) {
      this.rate = (this.riskFind.rate * 100) + " %";
    }
  }

  public addCreditLine(value: any) {

    if (value.risk === undefined || value.risk === "") {
      value.risk = "A"
    }

    this.riskFind = this.riskList.find(element => element.description === value.risk);
    value.risk = this.riskFind
    
    this.creditLineService.add(value).subscribe((response: Response) => {
      this.response = response;
    });
  }
}