import { Injectable } from "@angular/core";
import { Http, Headers,RequestOptions } from "@angular/http";
import { CreditLine } from "./credit-line.model";
import { Observable } from "rxjs/Observable";
import { CREDIT_LINE_ADD } from "../../app.api";
import { ErrorHandler } from "../app.error-handler";
import { Response } from "../response/response.model";


@Injectable()
export class CreditLineService{

    constructor( private http:Http ){}
    
    public add( creditLine:CreditLine ):Observable<Response>{
     
        console.log(JSON.stringify(creditLine))
        
        const headers = new Headers();
        headers.append("Content-Type","application/json")
            return this.http.post(`${CREDIT_LINE_ADD}`,JSON.stringify(creditLine), new RequestOptions({headers:headers})  )
        .map(response=>response.json())
        .catch(ErrorHandler.handleError);
    }
}