import { EventEmitter } from 'node:events';

const emmiter=new EventEmitter()

emmiter.on('tick',(dt)=>console.log('Clicking on '+dt))

emmiter.emit('tick',234)