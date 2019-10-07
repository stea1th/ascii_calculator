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
  result: string;
  variable = '';
  sentences = new Array<string>();

  constructor(private calcService: CalcServiceService, private dataService: DataServiceService) {
  }

  ngOnInit() {
  }

  showNum(num: string) {
    if (!this.variable.match("[-+*/]+")) {
      this.variable += num;
    } else {
      this.addVariable(this.variable);
      this.variable = num;
    }
    this.dataService.updateMessage(num);
  }

  showAction(num: string) {
    if(this.variable == '' && this.sentences.length != 0){
      this.variable = this.sentences[this.sentences.length - 1];
    }
    if (!this.variable.match("[-+*/]+")) {
      this.addVariable(this.variable);
      this.dataService.updateMessage(num);
    }
    this.variable = num;
  }

  showComma() {
    if(!this.variable.includes(',')){
      this.variable += ',';
      this.dataService.updateMessage(',');
    }
  }

  clear() {
    this.dataService.clearMessage();
    this.sentences.length = 0;
  }

  getResult() {
    this.temp = this.dataService.getMessage();
    this.calcService.getResult(this.temp).subscribe(data => {
      this.dataService.setMessage(data.result);
      this.sentences.length = 0;
    });
  }

  addVariable(variable: string) {
    if (variable != '') {
      this.sentences.push(variable);
    }
  }

  toggleMinus() {
    if(this.sentences.length == 0){

    }
  }

  removeLastExpression() {
    let expression;
    if(this.variable != '') {
      this.variable = '';
    } else {
      this.sentences.splice(this.sentences.length-1);
    }
    expression = this.sentences.join('');
    if(expression == ''){
      this.dataService.setMessage('0');
    } else {
      this.dataService.setMessage(expression);
    }
  }
}
