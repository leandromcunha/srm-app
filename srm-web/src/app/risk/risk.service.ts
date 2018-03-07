import { Injectable } from "@angular/core";
import { Observable } from "rxjs/Observable";
import { Risk } from "./risk.model";
import { RISK_LIST } from "../../app.api";
import { Http } from "@angular/http";
import "rxjs/add/operator/map"
import "rxjs/add/operator/catch"
import { ErrorHandler } from "../app.error-handler";



@Injectable()
export class RiskService{

    constructor( private http:Http ){
    }

    riskList(): Observable<Risk[]> {
        return this.http.get(`${RISK_LIST}`)
          .map(response=>response.json())
          .catch(ErrorHandler.handleError);
    }

}