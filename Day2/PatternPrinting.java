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
    
        // for(int i=0; i<n;i++){
        //     for(int j=1;j<=n;j++)
        //         System.out.print(j+" ");
        //     System.out.println();
        // }

        //Q3 print * square of n 
    
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q4 right facing triangle of *
        // for(int i=1; i<=n;i++){
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        //     }

        //Q5 left facing triangle

        // for(int i=1; i<=n;i++){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q6 inverted right facing triangle
        // for(int i=n; i>=1;i--){
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        //     }

        //Q7 inverted left facing triangle
        // for(int i=n; i>=1;i--){
        //         for(int k=1;k<=n-i;k++)
        //             System.out.print("  ");
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        //     }

        //Q8 left facing with double space
        // for(int i=n; i>=1;i--){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("    ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q9 hollow square
        // for(int i=1; i<=n;i++){
        //         for(int j=1;j<=n;j++){
        //             if(i==1||i==n||j==1||j==n){
        //                 System.out.print("* ");
        //             }
        //             else{
        //                 System.out.print("  ");
        //             }
        //         }
                
        //         System.out.println();
        //     }
        //Q10 cross
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||(i+j)==n+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}