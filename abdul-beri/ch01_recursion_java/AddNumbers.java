package ch01_recursion_java;

import java.util.Scanner;

public class AddNumbers {

    static int add(int n){
        if(n>0){
            return add(n-1)+n;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.print("Enter a natural number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = add(n);
        System.out.println(sum);
    }
}
