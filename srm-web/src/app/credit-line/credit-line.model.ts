import { Risk } from "../risk/risk.model";

export interface CreditLine{
    creditLineId:number
    customer:string
	creditLine:number
	risk:Risk
}