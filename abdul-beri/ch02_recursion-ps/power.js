function pow(n,p){
    if(n==0){
        return 0;
    }else if(p==0){
        return 1;
    }
    return pow(n,p-1)*n
}
console.log(pow(10,8))