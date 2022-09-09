package using_java.ch02_recursion_application;

public class TylorSeries {
    static double p = 1, f=1;
    static double tylor(int n,int x){
        if(x==0){
            return 1;
        }else{
            double r = tylor(n,x-1);
            p = p*n;
            f = f*x;
            return r +(p/f);
        }
    }
    public static void main(String[] args) {
        System.out.println(tylor(1, 10));
    }
}
