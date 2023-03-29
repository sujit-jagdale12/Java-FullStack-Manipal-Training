
const numbers = [10, 20, 30, 40, 50]

console.log(`🔥 For Loop 🔥`)
for (let i = 0; i < numbers.length; i++) {
    const element = numbers[i];
    console.log(`Index ${i} : Element-> ${element}`)
}

console.log(`🔥 While Loop 🔥`)
let i = 0;
while (i < numbers.length) {
    console.log(`Index ${i} : Element-> ${numbers[i]}`)
    i++;
}

console.log(`🔥 Do While Loop 🔥`)
let j = 0;
do {
    console.log(`Index ${i} : Element-> ${numbers[j]}`)
    j++
} while (j < numbers.length)

console.log(`🔥 For Each Loop anonymous function 🔥`)
numbers.forEach(element => {
    console.log(element)
});

console.log(`🔥 For In Loop return index 🔥`)
for (ele in numbers) {
    console.log(ele)
}
console.log(`🔥 For Of Loop return value 🔥`)
for (ele of numbers) {
    console.log(ele)
}