public class Binarysearch{
    static int binarySearch(int[] arr, int n){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n)
                return mid;
            else if(arr[mid]<n)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    //lowerbound(first occurance)
    static int lowerbound(int[] arr,int num){
        int firstoccurance=-1;
        int low=0, high=arr.length-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                firstoccurance=mid;
                high=mid-1;
            }
            else if(arr[mid]<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return firstoccurance;
    }

    //upperbound
    static int upperbound(int[] arr, int num){
        int ans=-1;
        int low=0, high=arr.length-1, mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }
            else if(arr[mid]<num)
                low=mid+1;
            else
                high=mid-1;
        }
        return ans;
    }

    //count occurance
    static int countOccurance(int[] arr, int num){
        int first=lowerbound(arr,num);
        if(first==-1) return 0;
        return upperbound(arr,num)-first;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,3,4,5,6,7,8,9};
        // System.out.println(binarySearch(arr,7));
        // System.out.println(lowerbound(arr,2));
        System.out.println(countOccurance(arr,10));
    }
}