let a = 0 //static variable
function fun(n){
    if(n>0){
        a++
        return fun(n-1)+a
    }
    return 0
}
console.log(fun(5))

// function fun(n){
//     if(n>0){
//         return fun(n-1)+n
//     }
//     return 0
// }
// console.log(fun(6))