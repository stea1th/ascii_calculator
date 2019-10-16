import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calc-body',
  templateUrl: './calc-body.component.html',
  styleUrls: ['./calc-body.component.css']
})
export class CalcBodyComponent implements OnInit {

  items: [];
  line: string;
  calcResult: any;

  constructor() { }

  ngOnInit() {
  }

  receiveItems($event) {
    this.calcResult = $event;
    this.items = this.calcResult.matrix;
    this.line = this.calcResult.result;
  }
}
