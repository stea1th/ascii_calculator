import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CalcAsciiVersionComponent } from './calc-ascii-version.component';

describe('CalcAsciiVersionComponent', () => {
  let component: CalcAsciiVersionComponent;
  let fixture: ComponentFixture<CalcAsciiVersionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CalcAsciiVersionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CalcAsciiVersionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
