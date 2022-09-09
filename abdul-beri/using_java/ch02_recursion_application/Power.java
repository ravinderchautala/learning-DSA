package using_java.ch02_recursion_application;

import java.util.Scanner;

public class Power {
    // static int pow(int x, int n){
    //     if(n==0){
    //         return 1;
    //     }else{
    //         return pow(x,n-1)*x;
    //     }
    // }
    static int pow(int x, int n){
        if(n==0){
            return 1;
        }else if(n%2==0){
            return pow(x*x,n/2);
        }else{
            return x*pow(x*x,(n-1)/2);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.print("Enter the power: ");
            int n = sc.nextInt();
            int power = pow(x,n);
            System.out.println(power);
        }
    }
}
