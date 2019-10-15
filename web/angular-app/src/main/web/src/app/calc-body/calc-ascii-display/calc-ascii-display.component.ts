import {Component, OnInit} from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";

@Component({
  selector: 'app-calc-ascii-display',
  templateUrl: './calc-ascii-display.component.html',
  styleUrls: ['./calc-ascii-display.component.css']
})
export class CalcAsciiDisplayComponent implements OnInit {
  public items = ["xxxxx xxxxx x   x xxxxx xxxxx ","    x     x x   x x     x     ","xxxxx xxxxx xxxxx xxxxx xxxxx ","x         x     x     x x   x ","xxxxx xxxxx     x xxxxx xxxxx "];

  constructor(private calcService: CalcServiceService) {
  }

  ngOnInit() {
    this.items.forEach(i=> i.replace(' ', '&#8199;'));

    // this.calcService.getAscii("0").subscribe(data => this.items = data);

    }

}
