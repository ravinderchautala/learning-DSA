function fac(n) {
    if (n == 0) {
        return 1;
    }
    return fac(n - 1) * n
}
function nCr(n, r) {
    let a = fac(n)
    let b = fac(r)
    let c = fac(n - r)
    return a/(b*c)
}
console.log(nCr(5,3))
// recursive ncr
function NCR(n,r){
    if(n==r || r==0){
        return 1
    }
    return NCR(n-1,r-1)+NCR(n-1,r)
}
console.log(NCR(5,3))