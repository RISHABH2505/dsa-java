package Day16;

public class Mergesort {
    static int[] mergesort(int[] arr,int l,int h){
        if(arr.length<=1) return arr;
        if(l<h){
        int mid=(l+h)/2;
        mergesort(arr, l, mid-1);
        mergesort(arr, mid+1, h);
        merge(arr,l,mid,h);
        }
        return arr;
    }
    static void merge(int[]arr,int l,int mid,int h){
        
    }
    public static void main(String[] args) {
        
    }
}
