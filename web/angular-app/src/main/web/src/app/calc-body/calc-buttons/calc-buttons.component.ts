import {Component, OnInit} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-buttons',
  templateUrl: './calc-buttons.component.html',
  styleUrls: ['./calc-buttons.component.css']
})
export class CalcButtonsComponent implements OnInit {

  temp: string;

  constructor(private calcService: CalcServiceService, private dataService: DataServiceService) {
  }

  ngOnInit() {
  }

  show(num: string) {
    this.dataService.updateMessage(num);
  }

  clear() {
    this.dataService.clearMessage();
  }

  getResult() {
    this.dataService.currentMessage.subscribe(data=> this.temp = data);
    this.calcService.getResult(this.temp).subscribe(data => {
      this.dataService.setMessage(data.expression + data.result);
    });
  }
}
