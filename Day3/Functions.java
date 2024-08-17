public class Functions{
    // static void sayHi(String s){
    //     System.out.println(s);
    // }
    // static void swap(int a,int b){
    //     a=a+b;
    //     b=a-b;
    //     a=a-b;
    //     System.out.println(a+" "+b);
    // }

    //function to print first n natural number
    // static void printnatural(int n){
    //     for (int i=1;i<=n;i++){
    //         System.out.print(i+" ");
    //     }
    // }
    //function to check if number n is prime or not.

    // static boolean checkprime(int n){
    //     for(int i=2;i<n;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //function to return inverse of a number n

    // static int reverse(int n){
    //     int a=0;
    //     while(n>0){
    //         int r=n%10;
    //         n=n/10;
    //         a=a*10+r;
    //     }
    //     return a;
        
    // }

    //function to return number of digits present in a number n.

    static int countnumber(int n){
        int count=0;
        while(n!=0){
            count=count+1;
            n=n/10;
        }
        return count;
    }

    //function to check whether a number is armstrong or not
    static boolean checkarmstrong(int n){
        int a=0,b=n;
        int digits=countnumber(n);
        while(b!=0){
            a+=Math.pow(b%10,digits);
            b=b/10;
        }
        return (a==n);
    }
    public static void main(String[] args){
        // sayHi("Hello");
        // swap(2,5);
        int n=121;
        // printnatural(n);
        // System.out.println(checkprime(n));
        System.out.println(checkarmstrong(n));
    }
}