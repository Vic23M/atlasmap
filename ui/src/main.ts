import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { environment } from './environments/environment';
import { HostAppModule } from './app/host-app.module';

if (environment.production) {
  enableProdMode();
}

/* tslint:disable:no-console */
platformBrowserDynamic()
  .bootstrapModule(HostAppModule)
  .catch(err => console.log(err));
