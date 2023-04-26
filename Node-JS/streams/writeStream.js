import * as fs from 'node:fs';

const writeStream=fs.createWriteStream('./write.txt')

writeStream.write("Writing to file 📰")
writeStream.end()
