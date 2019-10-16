import {Component, OnInit, ViewChild} from '@angular/core';
import {CalcAsciiButtonsComponent} from "./calc-ascii-buttons/calc-ascii-buttons.component";

@Component({
  selector: 'app-calc-body',
  templateUrl: './calc-body.component.html',
  styleUrls: ['./calc-body.component.css']
})
export class CalcBodyComponent implements OnInit {

  items: [];

  constructor() { }

  ngOnInit() {
  }

  receiveItems($event) {
    this.items = $event;
  }
}
