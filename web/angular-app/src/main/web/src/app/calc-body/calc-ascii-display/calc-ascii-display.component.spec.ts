import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcAsciiDisplayComponent } from './calc-ascii-display.component';

describe('CalcAsciiDisplayComponent', () => {
  let component: CalcAsciiDisplayComponent;
  let fixture: ComponentFixture<CalcAsciiDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcAsciiDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcAsciiDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
