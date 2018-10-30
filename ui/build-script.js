const fs = require('fs-extra');
const concat = require('concat');
const path = require('path');

(async function build() {
  const files = [
    './dist/app/runtime.js',
    './dist/app/polyfills.js',
    './dist/app/scripts.js',
    './dist/app/vendor.js',
    './dist/app/main.js'
  ];

  await fs.ensureDir('dist/wc');
  await concat(files, 'dist/wc/atlasmap-wc.js');

  const location = path.resolve(__dirname, 'dist', 'wc', 'package.json');
  const pkgJson = {
    version: '0.0.5',
    name: '@atlasmap/atlasmap-data-mapper',
    description: 'Atlasmap Data Mapper UI module as Web Component',
    license: 'MIT',
    main: 'atlasmap-wc.js'
  };
  fs.writeFileSync(location, JSON.stringify(pkgJson, null, 2));

})();
