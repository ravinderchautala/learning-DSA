// function fibo(n){
//     if(n<=1){
//         return n
//     }else{
//         return fibo(n-2)+fibo(n-1)
//     }
// }
// console.log(fibo(6))
// with the help of array
const arr = new Array(10)
for(let i=0;i<10;i++){
    arr[i]=-1
}
function fib(n){
    if(n<=1){
        arr[n]=n
        return n
    }else {
        if(arr[n-2]==-1){
        arr[n-2]=fib(n-2);
        }
        if(arr[n-1]==-1){
        arr[n-1]=fib(n-1);
        }
        return arr[n-2]+arr[n-1]
    }
    return 0
}
console.log(fib(6))