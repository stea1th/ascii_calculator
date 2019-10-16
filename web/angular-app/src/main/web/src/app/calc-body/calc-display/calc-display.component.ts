import {Component, Input, OnInit} from '@angular/core';
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-display',
  templateUrl: './calc-display.component.html',
  styleUrls: ['./calc-display.component.css']
})
export class CalcDisplayComponent implements OnInit {

  @Input('display-items') displayItems: string;

  constructor() {
  }

  ngOnInit() {
  }

}
