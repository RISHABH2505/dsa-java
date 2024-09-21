public class assignment{
    static int countnumber(int n){
        int count=0;
        while(n!=0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
    static void sumEvenOdd(int n){
        int digits=countnumber(n);
        int even=0,odd=0;
        for(int i=digits;i>=1;i--){
            int digit=n%10;
            if((digits-i+1)%2==0)
                even+=digit;
            else
                odd+=digit;
            n=n/10;
        }
        System.out.println("Sum of even digits: "+even);
        System.out.println("Sum of odd digits: "+odd);
    }
    static int countNooftimes(int n,int digit){
        int count=0;
        while(n!=0){
            if(n%10==digit){
                count=count+1; 
            }
            n=n/10;
        }
        return count;
    }
    static int printReverse(int n){
        int reverse=0;
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return reverse;
    }
    static int binaryToDecimal(int n){
        int decimal=0;
        int power=0;
        while(n!=0){
            int digit=n%10;
            decimal+=digit*Math.pow(2,power);
            n=n/10;
            power++;
        }
        return decimal;
    }
    static int lcm(int a, int b){
        for(int i=1;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int n=101010;
        // System.out.println(countNooftimes(n,3));
        // System.out.println(binaryToDecimal(n));
        System.out.println(lcm(4,6));
    }
}