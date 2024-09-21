package Day14;

public class Recursion2 {
    //fibonacci
    // static int fibonacci(int n){
    //     if (n==0||n==1) return n;
    //     return fibonacci(n-1)+fibonacci(n-2);
    // }

    //subsequences
    static void subsequence(String S,String ans){
        if(S.length()==0){
            System.out.println(ans);
            return;
        }
        subsequence(S.substring(1), ans+S.charAt(0));
        subsequence(S.substring(1), ans);
    }

    //coin toss
    static void cointoss(int n,String ans){
        if (n==0){
            System.out.println(ans);
            return;
        }
        cointoss(n-1,"H"+ans);
        cointoss(n-1,"T"+ans);
    }
    //count cointoss
    static int countcointoss(int n){
        if (n==0){
            return n;
        }
        if(n==1) return 2;
        int l=countcointoss(n-1);
        int r=countcointoss(n-1);
        return l+r;
    }
    
    //count subsequence
    static int countsubsequence(String S ){
        if(S.length()==0){
            return 1;
        }
        int l=countsubsequence(S.substring(1));
        int r=countsubsequence(S.substring(1));
        return l+r;
    }
    //using tail
    static int tailcountsubsequence(String S,int c){
        if(S.length()==0){
            return c;
        }
        return tailcountsubsequence(S.substring(1),c*2);
    }

    //generate valid parenthesis
    static void validparenthesis(int n,String s,int l,int r){
        if(l==n && r==n){
            System.out.println(s);
            return;
        }
        if(l<n) validparenthesis(n, s+"{", l+1, r);
        if(r<l) validparenthesis(n, s+"}", l, r+1);
        
    }
    static void generatepermutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            String s1=s.substring(0, i);
            String s2=s.substring(i+1);
            generatepermutation(s1+s2, ans+s.charAt(i));
        }
    }

    public static void main(String[] args) {
        // System.out.println(fibonacci(8));
        // subsequence("CAR", "");
        // cointoss(3, "");
        // System.out.println(countsubsequence("CAR"));
        // System.out.println(tailcountsubsequence("CAR",1));
        // validparenthesis(3, "", 0, 0);
        generatepermutation("abc", "");
    }
}
