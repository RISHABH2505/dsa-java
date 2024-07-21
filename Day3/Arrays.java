public class Arrays{
    //to print array
    static void printArr(int[] arr){
       // for(int i=0;i<arr.length;i++)
       //     System.out.print(arr[i]+" ");
       // System.out.println();

       //for each loop
       for(int i:arr)
        System.out.print(i+" ");
    }

    //Q1
    static int SumArr(int[] arr){
        int sum=0;
        for(int i:arr)
            sum+=i;
        return sum;
    }
    
    //Q2
    static void printReverse(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        char[] arr=new char[10];
        int[] arr1=new int[10];
        int[] nums={1,2,3,4,5};
        // arr[0]=4;
        for(int i=0;i<arr.length;i++){
            arr1[i]=i+1;
        }
        // printArr(arr1);
        // System.out.println(arr[0]);
        // System.out.println(SumArr(arr1));
        printReverse(arr1);
        printArr(arr1);
        
    }
}