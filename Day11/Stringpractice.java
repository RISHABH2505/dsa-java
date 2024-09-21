public class Stringpractice{
    //q1
    static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }

    //q2
    static boolean checkpalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    //q3
    static char maxoccur(String s){
        int countmaxocc=0;
        char maxocc='*';
        int countcurrel=0;
        char currel='*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currel){
                if(countcurrel>countmaxocc){
                    countmaxocc=countcurrel;
                    maxocc=currel;
                }
                currel=s.charAt(i);
                countcurrel=1;
            }else{
                countcurrel++;
            }
        }
        if(countcurrel>countmaxocc){
            countmaxocc=countcurrel;
            maxocc=currel;
        }
        return maxocc;
    }

    //q4
    static char maxoccunsorted(String s){
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[index]){
                index=i;
            }
        }
        return (char)('a'+index);
    }

    //q5
    static String reverseword(String s){
        String[] words=s.split("\\s");
        String s1="";
        for(int i=words.length-1;i>=0;i--){
            s1+=words[i]+" ";
        }
        return s1.trim();
    }
    public static void main(String[] args){
        //regex
        // String s1="This\sis\sa\sclass";
        // String s2="This\tis\ta\ttab";
        // String s3="This is line 1.\nThis is line 2.";
        // String s4="This is \r funny";
        // String s5="Rule \f";
        // String s6="\"Hello\"";
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);
        // System.out.println(s6);

        //split
        // String s1="this is a class";
        // String[] arr=s1.split("\\s",2);
        // for(String s:arr)
        //     System.out.println(s);

        //string intern
        // String s1="hello";
        // String s2=new String("hello");
        // String s3=new String("hello").intern();//used to check value if it is present in string pool or not.
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);

        //value of
        // int n=5;
        // String s=String.valueOf(n);//it support boolean,char,int,double,char arr,long,float,object.
        // System.out.println(s);

        String s="the bird is flying";
        // System.out.println(reverse(s));
        // System.out.println(checkpalindrome(s));
        System.out.println(reverseword(s));
    }
}