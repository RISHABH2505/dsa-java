public class problem{
    static int sum(int[] arr,int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=arr[i];
        }
        return sum;
    }
    static int max(int[] arr){
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=sum(arr,i,j);
                maxsum=Math.max(maxsum,sum);
            }
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(max(arr));
    }
}