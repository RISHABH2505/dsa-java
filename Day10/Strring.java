public class Strring{
    public static void main(String[] args){
        String s1= "hello";
        String s2= new String("hello");
        String s3=s1;
        String s4=new String(s1);
        char[] c={'h','e','l','l','o'};
        String s5=new String(c);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(c);
    }
}