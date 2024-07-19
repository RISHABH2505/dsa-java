import java.util.Scanner;
class PatternPrinting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;
        //print all natural number upto 10
        //while
        // int i=1;
        // while(i<=10){
        //     System.out.println(i);
        //     //change statement
        //     i++;

        // }
        
        // for(int i=sc.nextInt();i<=10;i++){
        //     System.out.println(i);
        // }

        //Q1 Take an integer n as input and print * n times.
    
        // for(int i=0; i<n;i++){
        //     System.out.print("* ");
        // }

        //Q2
    
        for(int i=0; i<n;i++){
            for(int j=1;j<=n;j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}