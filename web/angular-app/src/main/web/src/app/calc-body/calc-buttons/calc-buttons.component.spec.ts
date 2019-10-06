import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcButtonsComponent } from './calc-buttons.component';

describe('CalcButtonsComponent', () => {
  let component: CalcButtonsComponent;
  let fixture: ComponentFixture<CalcButtonsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcButtonsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcButtonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
