import * as fs from 'node:fs';
import { Transform } from 'node:stream';

const readStream = fs.createReadStream('./read.txt');
const writeStream = fs.createWriteStream('./write.txt');

const transform = new Transform({
    transform(chunk, encoding, callback) {
        callback(null, chunk.toString().toUpperCase());
    }
})

readStream.pipe(transform).pipe(writeStream)