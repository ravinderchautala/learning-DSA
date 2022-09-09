function TOH(n,A,B,C){
    if(n>0){
        TOH(n-1,A,C,B)
        console.log("From "+A+" to "+C)
       return TOH(n-1,B,A,C)
    }
    return "Done"
}
console.log(TOH(3,1,2,3))