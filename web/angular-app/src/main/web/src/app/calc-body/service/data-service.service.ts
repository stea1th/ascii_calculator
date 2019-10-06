import {Injectable} from '@angular/core';
import {BehaviorSubject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private messageSource = new BehaviorSubject('0');
  currentMessage = this.messageSource.asObservable();
  temp: string;

  constructor() {
  }

  updateMessage(num: string) {
    if (this.messageSource.getValue() == '0') {
      this.messageSource.next(num);
    } else {
      this.currentMessage.subscribe(data => this.temp = data);
      this.messageSource.next(this.temp + num);
    }
  }

  clearMessage(){
    this.messageSource.next('0');
  }

  setMessage(num: string){
    this.messageSource.next(num);
  }
}
