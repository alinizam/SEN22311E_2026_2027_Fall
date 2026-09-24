package Week01Theory;

public class Example01 {
    static void main() {
        int result=f(5);
        System.out.println("\n"+result);
    }
    static int f(int n){
        int f;
        if (n==1 || n==0){
            System.out.print(n);
            return 1;
        }
        System.out.print(n+ " * f( ");
        f=n*f(n-1);
        System.out.print(" )");
        return f;
    }
}
