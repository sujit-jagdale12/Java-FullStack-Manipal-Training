import * as fs from 'node:fs';

const readStream=fs.createReadStream("./read.txt")

readStream.on('data',(data)=>{
    console.log(data.toString())
})