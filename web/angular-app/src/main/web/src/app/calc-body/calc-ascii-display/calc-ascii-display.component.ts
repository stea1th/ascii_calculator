import {Component, Input, OnInit} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-ascii-display',
  templateUrl: './calc-ascii-display.component.html',
  styleUrls: ['./calc-ascii-display.component.css']
})
export class CalcAsciiDisplayComponent implements OnInit {
   @Input('display-items') displayItems = [];

  constructor() {
  }

  ngOnInit() {

  }

}
