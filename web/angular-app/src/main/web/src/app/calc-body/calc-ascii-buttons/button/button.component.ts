import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'app-button',
  templateUrl: './button.component.html',
  styleUrls: ['./button.component.css']
})
export class ButtonComponent implements OnInit {

  @Output() onClick = new EventEmitter<MouseEvent>();
  @Input() buttonView: string;
  @Input('is-action') isAction: boolean;
  @Input() color: string;


  constructor() { }

  ngOnInit() {
    this.isAction = this.isAction !== undefined;
  }

  onClickButton(event) {
    this.onClick.emit(event);
  }

}
