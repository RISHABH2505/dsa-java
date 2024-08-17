public class Array2{

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseusingswap(int[] arr){
        // for(int i=0;i<arr.length/2;i++){
        //     int j=arr.length-1-i;
        //     swap(arr,i,j);
        // }
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            swap(arr,i,j);
        }
    }

    static void reverseswap2points(int[] arr,int a, int b){
        for(int i=a,j=b;i<j;i++,j--){
            swap(arr,i,j);
        }
    }

    static void printArr(int[] arr){
        for(int i:arr)
         System.out.print(i+" ");
    }
 
    //sum of array between 2 values
    static int SumArrb(int[] arr,int a,int b){
        int sum=0;
        if(b>=arr.length)
            return 0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //Reverse an array
    static void reverse(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[arr.length-1-i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }

    }
    public static void main(String[] args){
        int[] arr1=new int[10];
        int[] nums={1,2,3,4,5};
        for(int i=0;i<arr1.length;i++){
            arr1[i]=i+1;
        }
        // System.out.println(SumArrb(arr1,2,7));
        // swap(arr1);
        // reverseusingswap(arr1);
        reverseswap2points(arr1,2,7);
        printArr(arr1);
    }
}