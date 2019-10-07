import {Injectable} from '@angular/core';
import {BehaviorSubject} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  private messageSource = new BehaviorSubject('0');
  currentMessage = this.messageSource.asObservable();
  message = '';

  constructor() {
  }

  updateMessage(num: string) {
    if (this.message.length < 23) {
      if (this.messageSource.getValue() == '0') {
        this.messageSource.next(num);
      } else {
        this.currentMessage.subscribe(data => this.message = data);
        this.messageSource.next(this.message + num);
      }
    }
  }

  clearMessage() {
    this.messageSource.next('0');
  }

  setMessage(num: string) {
    console.log(num);
    console.log(this.message);
    if (this.message.length < 23) {
      this.messageSource.next(num);
    }
  }

  getMessage(): string {
    this.currentMessage.subscribe((data => this.message = data));
    return this.message;
  }
}
