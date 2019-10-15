import { Component, OnInit } from '@angular/core';
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-ascii-buttons',
  templateUrl: './calc-ascii-buttons.component.html',
  styleUrls: ['./calc-ascii-buttons.component.css']
})
export class CalcAsciiButtonsComponent implements OnInit {

  constructor(private dataService: DataServiceService) { }

  ngOnInit() {
  }

  showNum(num: string): string {
    return num;
  }

}
