package Day15;

public class Batch {
    String batch_name;
    int cost;
    String topic;

    //constructor
    public Batch(){ //default constructor
        this.batch_name="default batch";
        this.cost=20000;
        this.topic="Java";
    }

    //custom constructor
    public Batch(String name,int price,String topic){
        this.batch_name=name;
        this.cost=price;
        this.topic=topic;
    }
}
