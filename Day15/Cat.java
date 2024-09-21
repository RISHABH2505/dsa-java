package Day15;

public class Cat {
    String name;
    String color;
    String breed;

    public Cat(){
        this.name="Cat";
        this.color="brown";
        this.breed="b1";
    }
    public Cat(
        String cat_name,
        String cat_color,
        String cat_breed
    ){
        this.name=cat_name;
        this.color=cat_color;
        this.breed=cat_breed;
    }

    void call_cat(){
        System.out.println(this.name+" is saying Meoww...!");
    }
}
