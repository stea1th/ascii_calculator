import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";

@Component({
  selector: 'app-calc-ascii-buttons',
  templateUrl: './calc-ascii-buttons.component.html',
  styleUrls: ['./calc-ascii-buttons.component.css']
})
export class CalcAsciiButtonsComponent implements OnInit {

  calcResult: any;

  @Output() itemsEvent = new EventEmitter<any>();

  constructor(private calcService: CalcServiceService) {
  }

  ngOnInit() {
    this.showNum('C');
  }

  showNum(num: string) {
    this.calcService.getAsciiNumber(num).subscribe(data => {
      this.calcResult = data;
      this.sendCalculatorResult();
    });
  }

  sendCalculatorResult() {
    this.itemsEvent.emit(this.calcResult);
  }

}
