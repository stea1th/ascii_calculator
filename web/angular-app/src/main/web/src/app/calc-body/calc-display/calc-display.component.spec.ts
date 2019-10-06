import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcDisplayComponent } from './calc-display.component';

describe('CalcDisplayComponent', () => {
  let component: CalcDisplayComponent;
  let fixture: ComponentFixture<CalcDisplayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcDisplayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcDisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
