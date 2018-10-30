/* tslint:disable:no-unused-variable */

import { TestBed, inject } from '@angular/core/testing';
import { HostAppModule } from './host-app.module';

describe('HostAppModule', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [HostAppModule],
    });
  });

  it(
    'should ...',
    inject([HostAppModule], (service: HostAppModule) => {
      expect(service).toBeTruthy();
    }),
  );
});
