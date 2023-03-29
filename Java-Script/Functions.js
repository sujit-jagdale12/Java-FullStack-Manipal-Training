function toUpper(name) {
    console.log(addition(1, 2, '+'))
    return "Hii " + name.toUpperCase() + " good morning."
}
console.log(toUpper('sujit'))

console.log(addition(1, 2, '+'))

function addition(num1, num2, op) {
    if (num1 < 10 && num1 > 100) return '❌ Bad Number'
    if (num2 < -10 && num2 > 10) return '❌ Bad Number'

    if (op == '+') {
        return num1 + num2
    }
    if (op == '-') {
        return num1 - num2
    }
    if (op == '*') return num1 * num2
    if (op == '/') return num1 / num2
}

const square=function(num){
    return num*num;
}
console.log("Square using function and printing using old way "+10+" is "+square(10))

const sq=n=>n*n
console.log(`Square using function and printing using new way ${10} is ${sq(10)}`)