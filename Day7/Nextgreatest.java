public class Nextgreatest{
    static int[] nger(int[] arr){
        int maxelement=0;
        int[] Nger=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            Nger[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);
        }
        return Nger;
    }
    static void disp(int[] arr){
        for(int i:arr) System.out.print(i+" ");
    }
    static int[] ngel(int[]arr){
        int maxelement=0;
        int[] Ngel=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            Ngel[i]=maxelement;
            maxelement=Math.max(arr[i],maxelement);
        }
        return Ngel;
    }
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        disp(ngel(arr));
    }
}