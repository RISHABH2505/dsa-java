public class Searching{
    static void printArr(int[] arr){
        for(int i:arr)
         System.out.print(i+" ");
    }

    //linear search
    static boolean linearSearch(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return true;
        }
        return false;
    }
    //return index of x if found else -1
    static int linearSearchindex(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
                return i;
        }
        return -1;
    }

    //binary search
    static boolean binarySearch(int[] arr, int n){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n)
                return true;
            else if(arr[mid]<n)
                i=mid+1;
            else
                j=mid-1;
        }
        return false;
    }
    //binary search between two values
    static boolean binarySearch2(int[] arr, int x, int y,int n){
        int i=x, j=y;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==n)
                return true;
            else if(arr[mid]<n)
                i=mid+1;
            else
                j=mid-1;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        // System.out.println(linearSearch(arr,5));
        // System.out.println(linearSearch(arr,7));
        // System.out.println(linearSearchindex(arr,5));
        // System.out.println(linearSearchindex(arr,7));
        // System.out.println(binarySearch(arr,7));
        // System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch2(arr,2,8,2));
    }
}