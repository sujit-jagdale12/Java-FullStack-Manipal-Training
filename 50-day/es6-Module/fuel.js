export default class FuelConvertor{
    constructor() {
        this.capacity = 10;
        this.tank = 'metal'
    }

    display() {
        console.log(`Capacity ${this.capacity}, Tank ${this.tank}`)
    }
}