package using_java.ch01_recursion_java;

public class NestedRecusion {
    static int fun(int n){
        if(n>100){
            return n-10;
        }else{
            return fun(fun(n+11));
        }
    }
    public static void main(String[] args) {
       int r = fun(100);
       System.out.println(r);
    }
}
