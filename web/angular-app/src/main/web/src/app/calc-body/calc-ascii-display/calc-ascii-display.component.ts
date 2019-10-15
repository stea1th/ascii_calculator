import { Component, OnInit } from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";

@Component({
  selector: 'app-calc-ascii-display',
  templateUrl: './calc-ascii-display.component.html',
  styleUrls: ['./calc-ascii-display.component.css']
})
export class CalcAsciiDisplayComponent implements OnInit {

  public items: [];

  constructor(private calcService: CalcServiceService) {

  }

  ngOnInit() {
    this.calcService.postAscii("0").subscribe(data => this.items = data);
  }

}
