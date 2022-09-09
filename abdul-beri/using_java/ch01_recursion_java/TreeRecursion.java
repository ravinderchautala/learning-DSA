package using_java.ch01_recursion_java;

public class TreeRecursion {
    static int fun(int n){
        if(n>0){
            System.out.print(" "+n);
            fun(n-1);
            fun(n-1);
        }
       return 0;
    }
    public static void main(String[] args) {
        int x = 3;
        fun(x);
    }
}
