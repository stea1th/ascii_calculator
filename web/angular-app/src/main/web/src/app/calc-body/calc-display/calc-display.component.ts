import {Component, Input, OnInit} from '@angular/core';
import {DataServiceService} from "../service/data-service.service";

@Component({
  selector: 'app-calc-display',
  templateUrl: './calc-display.component.html',
  styleUrls: ['./calc-display.component.css']
})
export class CalcDisplayComponent implements OnInit {

  display: string;

  constructor(private dataService: DataServiceService) {
  }

  ngOnInit() {
    this.dataService.currentMessage.subscribe(data => this.display = data);
  }

}
