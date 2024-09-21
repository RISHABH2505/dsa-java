package Day15;

public class Students {
    int roll;
    String name;
    Batch enrolled_batch;

    public Students(){
        this.roll=0;
        this.name="";
        this.enrolled_batch=new Batch();
    }

    public Students(int roll,String name,String batch_name,int cost,String topic){
        this.roll=roll;
        this.name=name;
        // this.enrolled_batch.batch_name=batch_name;
        // this.enrolled_batch.cost=cost;
        // this.enrolled_batch.topic=topic;
        enrolled_batch=new Batch(batch_name,cost,topic);
    }

    void study(){
        System.out.println(this.name+" is Studying!!");
    }
}
