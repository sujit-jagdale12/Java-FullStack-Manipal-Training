import { Buffer } from 'node:buffer';
import * as fs from 'node:fs/promises';

const buf1=Buffer.alloc(10);
console.log(buf1)

const buf2=Buffer.from("Buffer String")
console.log(buf2)
console.log(buf2.toString())

const subArr=buf2.subarray(0,2)
console.log(subArr)
console.log(subArr.toString())

const arr=Buffer.from([1,2,3,4,5])
console.log(arr)

const buf3=Buffer.from('hello')
const buf4=Buffer.from('world')
const bufConcat=Buffer.concat([buf3,buf4])
console.log(bufConcat.toString())

fs.writeFile('./text.txt','string buffer write and read')
.then( () => console.log('Data Written Successfully') )
    .catch(err => console.log(err))

fs.readFile('./text.txt').then((data)=>console.log(data.toString()))