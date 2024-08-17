import java.util.Arrays;
public class Sorting{
    static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int idx=minimumValue(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    static int minimumValue(int[] arr,int a){
        int mini=a;
        for(int i=a+1;i<arr.length;i++){
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }
    static void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] arr={9,8,2,1,3,4,5};
        // selectionsort(arr);
        // insertionsort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,3));
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}