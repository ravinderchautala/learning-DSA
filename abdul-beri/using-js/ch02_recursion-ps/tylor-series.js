let p = 1
let f = 1
function tylor(x, n) {
    let r
    if (n == 0) {
        return 1;
    } else {
        r = tylor(x, n - 1)
        p = p * x
        f = f * n
        return r + p / f
    }
    return 0;
}
console.log(tylor(1, 10))
// using harmor's rule

// function har(x, n) {
//     let s
//     if(n == 0) {
//         return s
//     } else {
//         s = 1 + x * s / n
//         return har(x, n - 1)
//     }
//     return 0;
// }
// console.log(har(1, 10))

// using loops

function loop(x,n){
    let s=1
    let num =1
    let den=1
    for(let i=1;i<n;i++){
        num*=x
        den*=i
        s+=num/den
    }
    return s
}
console.log(loop(1,10))
