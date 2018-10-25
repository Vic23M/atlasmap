const fs = require('fs-extra');
const concat = require('concat');

(async function build() {
  const files = [
    './dist/app/runtime.js',
    './dist/app/polyfills.js',
    // './dist/lib/bundles/atlasmap-atlasmap-data-mapper.umd.js',
    // './dist/lib/esm5/atlasmap-atlasmap-data-mapper.js',
    './dist/lib/esm2015/atlasmap-atlasmap-data-mapper.js',
    // './dist/lib/fesm5/atlasmap-atlasmap-data-mapper.js',
    // './dist/lib/fesm2015/atlasmap-atlasmap-data-mapper.js'
  ];

  await fs.ensureDir('dist/wc');
  await concat(files, 'dist/wc/atlasmap-wc.js');

})();

    // './dist/app/vendor.js',
    // './dist/app/scripts.js',
    // './dist/app/main.js'