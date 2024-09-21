package Day15;

public class Home {
    public static void main(String[] args) {
        Cat c1=new Cat();
        Cat c2=new Cat(
            "Tom",
            "White",
            "b2"
        );

        c1.call_cat();
        c2.call_cat();
    }
}
