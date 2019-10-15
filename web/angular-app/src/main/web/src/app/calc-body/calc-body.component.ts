import { Component, OnInit } from '@angular/core';
import {CalcServiceService} from "./service/calc-service.service";

@Component({
  selector: 'app-calc-body',
  templateUrl: './calc-body.component.html',
  styleUrls: ['./calc-body.component.css']
})
export class CalcBodyComponent implements OnInit {

  clickMessage= '0';

  constructor(private calcService: CalcServiceService) { }

  ngOnInit() {
  }

  testClick(num: string) {

    this.calcService.postResult(num).subscribe(data => {

      this.clickMessage = '' + data.expression + data.result;
    });
  }

}
