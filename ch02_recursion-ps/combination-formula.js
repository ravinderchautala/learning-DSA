function fac(n) {
    if (n == 0) {
        return 1;
    }
    return fac(n - 1) * n
}
function C(n, r) {
    let a = fac(n)
    let b = fac(r)
    let c = fac(n - r)
    return a/(b*c)
}
console.log(C(5,3))