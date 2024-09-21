import java.util.ArrayList;
import java.util.Collections;
public class Array_List{
    //create a function to find maximum sum subarray of size k

    static ArrayList<Integer> findSubArray(int[] arr,int k){
        int start=0;
        int end=k-1;
        int maxsum=0;
        for(int i=0;i<=end;i++){
            maxsum+=arr[i];
        }
        int currsum=maxsum;
        int idx=0;
        while(end<arr.length-1){
            currsum-=arr[start];
            start++;
            end++;
            currsum+=arr[end];
            if(currsum>maxsum){
                maxsum=currsum;
                idx=start;
            }
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=idx;i<idx+k;i++){
            arr1.add(arr[i]);
        }
        return arr1;
    }
    public static void main(String[] args){
        //Syntax
        // ArrayList<Integer> arr=new ArrayList<>();

        //add
        // arr.add(120);
        // arr.add(20);
        // arr.add(30);
        // arr.add(1,50);

        // //display
        // System.out.println(arr);

        // //get
        // System.out.println(arr.get(0));

        // //remove
        // System.out.println(arr.remove(1));
        // System.out.println(arr);

        // //update
        // arr.set(1,20);
        // System.out.println(arr);

        // //size
        // System.out.println(arr.size());

        // //sort
        // Collections.sort(arr);
        // System.out.println(arr);
        int[] arr={30,30,20,10,40,40};
        System.out.println(findSubArray(arr,2));

    }
}