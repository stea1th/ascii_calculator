import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcBodyComponent } from './calc-body.component';

describe('CalcBodyComponent', () => {
  let component: CalcBodyComponent;
  let fixture: ComponentFixture<CalcBodyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcBodyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcBodyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
