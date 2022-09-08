package ch01_recursion_java;

import java.util.Scanner;

public class HeadTail {
    // head function
    static int func(int n){
        if(n>0){
            func(n-1);
            System.out.println(n);
        }
        return 0;
    }
    // Tail function
    // static int func(int n){
    //     if(n>0){
    //         func(n-1);
    //         System.out.println(n);
    //     }
    //     return 0;
    // }
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How much number you want to print: ");
                int x = sc.nextInt();
                func(x);
    }
    }
}
