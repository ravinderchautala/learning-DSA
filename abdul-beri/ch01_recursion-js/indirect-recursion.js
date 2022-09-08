function fun1(n){
    if(n>0){
        console.log(n)
        fun2(n-1)
    }
}
function fun2(n){
    if(n>0){
        console.log(n)
        fun1(n/2)
    }
}
fun1(20)