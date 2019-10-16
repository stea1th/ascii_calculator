import {Component, OnInit} from '@angular/core';

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
