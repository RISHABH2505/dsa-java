public class Bssearchspace{
    static boolean check(int speed,int distance,int time){
        // if(speed*time>=distance) return true;
        // else return false;
        return (speed*time>=distance);
    }
    static int reachcenter(int distance,int time){
        int low=0,high=1000,ans=-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(mid,distance,time)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args){
        int distance=5000;
        int time=2;
        System.out.print(reachcenter(distance,time));
    }
}

//magnetic balls
//read books
//aggresive cows
//painter's patition
//koko eating banana