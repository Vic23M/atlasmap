const fs = require('fs-extra');
const concat = require('concat');

(async function build() {
  const files = [
    './dist/app/runtime.js',
    './dist/app/polyfills.js',
    './dist/app/main.js',
    './dist/app/scripts.js' // Include or no?
  ];

  await fs.ensureDir('dist/lib');
  await concat(files, 'dist/lib/atlasmap.js');

})();

