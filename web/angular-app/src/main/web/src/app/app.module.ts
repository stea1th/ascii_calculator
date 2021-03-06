import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from "@angular/common/http";

import {AppComponent} from './app.component';
import {CalcBodyComponent} from './calc-body/calc-body.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatButtonModule, MatSliderModule} from "@angular/material";
import {CalcDisplayComponent} from './calc-body/calc-display/calc-display.component';
import { CalcButtonsComponent } from './calc-body/calc-buttons/calc-buttons.component';
import { CalcAsciiDisplayComponent } from './calc-body/calc-ascii-display/calc-ascii-display.component';
import { CalcAsciiButtonsComponent } from './calc-body/calc-ascii-buttons/calc-ascii-buttons.component';
import { ButtonComponent } from './calc-body/calc-ascii-buttons/button/button.component';
import { CalcAsciiVersionComponent } from './calc-body/calc-ascii-version/calc-ascii-version.component';

@NgModule({
  declarations: [
    AppComponent,
    CalcBodyComponent,
    CalcDisplayComponent,
    CalcButtonsComponent,
    CalcAsciiDisplayComponent,
    CalcAsciiButtonsComponent,
    ButtonComponent,
    CalcAsciiVersionComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
