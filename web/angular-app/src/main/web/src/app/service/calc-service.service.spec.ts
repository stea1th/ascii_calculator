import { TestBed } from '@angular/core/testing';

import { CalcServiceService } from './calc-service.service';

describe('CalcServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CalcServiceService = TestBed.get(CalcServiceService);
    expect(service).toBeTruthy();
  });
});
