import {engine,util,calcObj,brake} from './carutilityexport.js';
import FuelConvertor from './fuel.js';

function carFun(){
    console.log(engine)
    console.log(util)
}

carFun()
calcObj()
brake()

const fc=new FuelConvertor()
fc.display()