import {Component, Input, OnInit} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-ascii-display',
  templateUrl: './calc-ascii-display.component.html',
  styleUrls: ['./calc-ascii-display.component.css']
})
export class CalcAsciiDisplayComponent implements OnInit {
   items = [];
  @Input('expression') expression: string;

  constructor(private calcService: CalcServiceService, private dataService: DataServiceService) {
  }

  ngOnInit() {
    this.dataService.currentMessage.subscribe(data => this.expression = data);
    this.calcService.getAscii(this.expression).subscribe(data => this.items = data);
  }

}
