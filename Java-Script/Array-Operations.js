arr=[4,6,3,2,6,7,1]

console.log("Originl array: "+arr)

console.log("Sorted array: "+arr.sort())

nums=arr.filter(el=>el>=3)
console.log("filtered array: "+nums)

arr.push(10);
arr.push(43);
arr.push(76);
arr.push(21);

console.log("New array: "+arr)