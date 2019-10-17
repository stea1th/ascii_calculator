import { Component, OnInit } from '@angular/core';
import {CalcServiceService} from "../service/calc-service.service";

@Component({
  selector: 'app-calc-ascii-version',
  templateUrl: './calc-ascii-version.component.html',
  styleUrls: ['./calc-ascii-version.component.css']
})
export class CalcAsciiVersionComponent implements OnInit {

  version: string;

  constructor(private calcService: CalcServiceService) { }

  ngOnInit() {
    // this.calcService.getVersion().subscribe(data=> this.version = data);
    this.version= "Hallo!";
  }

}
