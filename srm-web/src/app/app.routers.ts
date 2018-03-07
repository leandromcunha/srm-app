import { HomeComponent } from "./home/home.component";
import { Routes } from "@angular/router";
import { CreditLineComponent } from "./credit-line/credit-line.component";

export const ROUTERS : Routes = [
    { path: '' , component: HomeComponent },
    { path: 'credit_line' , component: CreditLineComponent }

]