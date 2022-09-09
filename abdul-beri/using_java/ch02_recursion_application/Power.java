package ch01_recursion_java;

import java.util.Scanner;

public class Power {
    static int pow(int x, int n){
        if(n==0){
            return 1;
        }else{
            return pow(x,n-1)*x;
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        int power = pow(x,n);
        System.out.println(power);
    }
}
