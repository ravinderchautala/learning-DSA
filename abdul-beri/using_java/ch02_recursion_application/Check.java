package using_java.ch02_recursion_application;

public class Check {
    public static void main(String[] args) {
       int n = 5;
       for(int i = 0;i<n;i++){
        int a = n;
        while(a>0){
       for(int j = 0;j<n-i;j++){
           System.out.print(a);
       }
       a--;
   }
   System.out.print(" $");
}
    }
}