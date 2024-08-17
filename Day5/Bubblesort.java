public class Bubblesort{
    static void bubbleSort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    
    }
    public static void main(String[] args){
        int[] arr={9,8,2,1,3,4,5};
        bubbleSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}