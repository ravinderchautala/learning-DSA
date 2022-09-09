package using_java.ch01_recursion_java;


// Static Variable
public class StaticVar {
    static int x = 0;
    static int fun(int n){
            if(n>0){
                x++;
                return fun(n-1)+x;
            }
            return 0;
    }
    public static void main(String[] args) {
    int r;
    r=fun(5);
    System.out.println(r);
    }
}
