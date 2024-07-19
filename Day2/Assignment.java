import java.util.Scanner;
class Assignment{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=7;

        //Q1 print * square of n 
    
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q2 right facing triangle of *
        // for(int i=1; i<=n;i++){
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        // }

        //Q3 inverted right facing triangle
        // for(int i=n; i>=1;i--){
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        // }

        //Q4 left facing triangle
        // for(int i=1; i<=n;i++){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q5 inverted left facing triangle
        // for(int i=n; i>=1;i--){
        //         for(int k=1;k<=n-i;k++)
        //             System.out.print("  ");
        //         for(int j=1;j<=i;j++)
        //             System.out.print("* ");
        //         System.out.println();
        // }

        //Q6 left facing with double space
        // for(int i=n; i>=1;i--){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("    ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q7 hollow square
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
        // }

        //Q8 cross
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j||(i+j)==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q9
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q10
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q11        
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if (j%2==0){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         if ((i+j)%2==0){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q12
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if (j%2==0){
        //             System.out.print("! ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         if ((i+j)%2==0){
        //             System.out.print("! ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Q13
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q14
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=n-i+1;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q15
        // for(int i=n; i>=1;i--){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("    ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(int i=2; i<=n;i++){
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("    ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q16
        // for(int i=n; i>=1;i--){
        //     for(int k=1;k<=i-1;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(int i=2; i<=n;i++){
        //     for(int k=1;k<=i-1;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q17
        // int a=(n+1)/2;
        // for(int i=a;i>=1;i--){
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=a-i+1;k++)
        //         System.out.print("  ");
        //     for(int k=1;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i-1;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(int i=1;i<=a-1;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int k=2;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q18
        // int a=(n+1)/2;
        // for(int i=1;i<=a;i++){
        //     for(int k=1;k<=a-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i=a-1;i>=1;i--){
        //     for(int k=1;k<=a-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Q19
        // int a=(n+1)/2;
        // for(int i=a;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int k=2;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i && j<a;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // for(int i=2;i<=a;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int k=2;k<=a-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i && j<=a-1;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q20
        // int a=(n+1)/2;
        // for(int i=1;i<=a;i++){
        //     for(int k=1;k<=a-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1){
        //             System.out.print("*\t");
        //         }
        //         else
        //             System.out.print(" \t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         if(j==i-1){
        //             System.out.print("*\t");
        //         }
        //         else
        //             System.out.print(" \t");
                
        //     }
        //     System.out.println();
        // }
        // for(int i=a-1;i>=1;i--){
        //     for(int k=1;k<=a-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1){
        //             System.out.print("*\t");
        //         }
        //         else
        //             System.out.print(" \t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         if(j==i-1){
        //             System.out.print("*\t");
        //         }
        //         else
        //             System.out.print(" \t");
                
        //     }
        //     System.out.println();
        // }

        //Q21
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int k=2;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i && j<=n-1;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q22
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int k=2;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i && j<n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

        //Q23
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("1 ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print("1 ");
        //     }
        //     System.out.println();
        // }

        //Q24
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //Q25
        // int a=1;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     System.out.println();
        // }

        //Q26
        // for(int i=1;i<=n;i++){
        //     int a=1;
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(a+"\t");
        //         a++;
        //     }
        //     System.out.println();
        // }

        //Q27
        // for(int i=1;i<=n;i++){
        //     int a=i-1;
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+"\t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         System.out.print(a+"\t");
        //         a--;
                
        //     }
        //     System.out.println();
        // }

        //Q28
        // for(int i=1;i<=n;i++){
        //     int a=i-1;
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         a++;
        //         System.out.print(a+"\t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         a--;
        //         System.out.print(a+"\t");
                
        //     }
        //     System.out.println();
        // }

        //Q29
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1){
        //             System.out.print(i+"\t");
        //         }
        //         else
        //             System.out.print("0\t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         int a=1;
        //         if(j==i-1){
        //             System.out.print(i+"\t");
        //         }
        //         else
        //             System.out.print("0\t");
                
        //     }
        //     System.out.println();
        // }

        //Q30
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n;j++){    
        //         int a=n-j+1;
        //         System.out.print(a+" ");
        //     }
             
        //     System.out.println();
        // }

        //Q31
        // for(int i=1; i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if((i+j)==n+1){
        //             System.out.print("* ");
        //         }
        //         else{
        //             int a=n-j+1;
        //         System.out.print(a+" ");
        //         }
        //     }
                
        //     System.out.println();
        // }

        //Q32
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j==i)
        //             System.out.print(i+" ");
        //         else
        //         System.out.print(i+" * ");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         if(j==i)
        //             System.out.print(i+" ");
        //         else
        //         System.out.print(i+" * ");
        //     }
        //     System.out.println();
        // }

        //Q33
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if (j==i)
                    System.out.print("0 ");
                else{
                    System.out.print(n-i+j+" ");
                }
            }
            for(int j=2;j<=i;j++){
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}
