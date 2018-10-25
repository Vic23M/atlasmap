import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import '@webcomponents/custom-elements/src/native-shim';
// import '@webcomponents/webcomponentsjs/custom-elements-es5-adapter';

import { environment } from './environments/environment';
import { ExampleAppModule } from './app/example-app.module';

if (environment.production) {
  enableProdMode();
}

/* tslint:disable:no-console */
platformBrowserDynamic()
  .bootstrapModule(ExampleAppModule)
  .catch(err => console.log(err));
