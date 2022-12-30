package December29th2022;

public class Question18 {
    String type ="4W";
    int maxSpeed = 100;
    Question18 (String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
    Question18(){}
}
class Car1 extends Question18{
    String trans;
    Car1(String trans){     //line n1
        this.trans=trans;
    }
    Car1 (String type, int maxSpeed, String trans){
        super(type,maxSpeed);      //line n2
        this.trans=trans;
    }

    public static void main(String[] args) {
        Car1 c1 = new Car1("Auto");
        Car1 c2 = new Car1("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
    }
    // Output ===>A)4W 100 Auto
    //              4W 150 Manual
}