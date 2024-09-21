package Day16;
public class Keypad {
    static void keypad(String s,String ans){
        String[] arr={"","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=s.charAt(0);
        String press=arr[ch-'0'];
        for(int i=0;i<press.length();i++){
            keypad(s.substring(1),ans+press.charAt(i));
        }

    }
    public static void main(String[] args) {
        keypad("245", "");
    }
}
