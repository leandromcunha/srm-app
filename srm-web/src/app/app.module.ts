import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { ROUTERS } from "./app.routers";
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { CreditLineComponent } from './credit-line/credit-line.component';
import { RiskService } from './risk/risk.service';
import { CreditLineService } from './credit-line/credit-line.service';
import { InputComponent } from './shareds/input/input.component';
import { SelectSingleComponent } from './shareds/select-single/select-single.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CreditLineComponent,
    InputComponent,
    SelectSingleComponent
  ],

  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot( ROUTERS )
  ],
  
  providers: [ RiskService, CreditLineService ],
  bootstrap: [AppComponent]
})

export class AppModule { }
