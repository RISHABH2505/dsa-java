package Day13;

public class Recursion {
    // static int fact(int n){
    //     if(n==0||n==1) return 1;
    //     return n*fact(n-1);
    // }
    // static int power(int a,int b){
    //     if(b==0) return 1;
    //     return a*power(a,b-1);
    // }

    //tail recursion fact
    static int tailfact(int n,int x){
        if(n==0||n==1) return x;
        return tailfact(n-1,n*x);
    }
    public static void main(String[] args) {
        // System.out.println(fact(5));
        // System.out.println(power(2,3));
        System.out.println(tailfact(5, 1));
    }
}
