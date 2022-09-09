package ch01_recursion_java;

public class IndirectRecursion {
    static void fun1(int n){
        if(n>0){
            System.out.print(" "+ n +" ");
            fun2(n-1);
        }
    }
    static void fun2(int n){
        if(n>1){
            System.out.print(" "+ n +" ");
            fun1(n/2);
        }
    }
    public static void main(String[] args) {
        int x = 20;
        fun1(x);
    }
}
