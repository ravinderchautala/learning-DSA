package ch01_recursion_java;

import java.util.Scanner;

public class Factorial {
    static int fac(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return fac(n-1)*n;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = fac(n);
        System.out.println(factorial);
    }
    
}
