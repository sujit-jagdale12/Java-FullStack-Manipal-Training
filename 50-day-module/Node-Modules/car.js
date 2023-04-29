const exported  = require('./carparts')

const { engine, util, calcObj ,brake} = exported.someObj

function carFunctionality() {
    console.log(engine)
    console.log(util)
}

carFunctionality()
calcObj()
brake()