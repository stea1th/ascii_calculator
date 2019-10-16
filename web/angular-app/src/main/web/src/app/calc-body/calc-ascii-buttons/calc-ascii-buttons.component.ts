import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";

@Component({
  selector: 'app-calc-ascii-buttons',
  templateUrl: './calc-ascii-buttons.component.html',
  styleUrls: ['./calc-ascii-buttons.component.css']
})
export class CalcAsciiButtonsComponent implements OnInit {

  items: [];

  @Output() itemsEvent = new EventEmitter<[]>();

  constructor(private calcService: CalcServiceService) {
  }

  ngOnInit() {
    this.clear();
  }

  showNum(num: string) {
    this.calcService.getAsciiNumber(num).subscribe(data => {
      this.items = data;
      this.sendItems();
    });
  }

  clear() {
    this.calcService.clear().subscribe(data => {
        this.items = data;
        this.sendItems();
    });
  }

  showAction(num: string) {
    this.calcService.getAction(num).subscribe(data => {
      this.items = data;
      this.sendItems();
    });
  }

  sendItems() {
    this.itemsEvent.emit(this.items);
  }

}
