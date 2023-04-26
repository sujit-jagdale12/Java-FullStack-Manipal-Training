import * as fs from 'node:fs';
import { PassThrough } from 'node:stream';

const readStream = fs.createReadStream('./read.txt');
const writeStream = fs.createWriteStream('./write.txt');

const tunnel = new PassThrough()
// writeStream.write("writing using the duplex js file.")

readStream.on('data', (chunk) => {
    console.log(chunk.toString());
});

readStream.pipe(tunnel).pipe(writeStream)
// writeStream.end()