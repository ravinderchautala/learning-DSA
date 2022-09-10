package using_java.ch02_recursion_application;

import java.util.Scanner;

public class Febonacci {
    static int num1 = 0, num2 = 1,num3;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        if(n>2){
            System.out.println(num1);
            System.out.println(num2);
            for(int i = 2; i<n;i++){
                num3 = num1+num2;
                num1 = num2;
                num2 = num3;
                System.out.println(num3);
            }
        }else{
            System.out.println(n);
        }
    }
}
