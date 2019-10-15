import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcAsciiButtonsComponent } from './calc-ascii-buttons.component';

describe('CalcAsciiButtonsComponent', () => {
  let component: CalcAsciiButtonsComponent;
  let fixture: ComponentFixture<CalcAsciiButtonsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcAsciiButtonsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcAsciiButtonsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
