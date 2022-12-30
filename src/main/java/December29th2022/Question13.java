package December29th2022;

public class Question13 {
    int x;
    Question13 (){
        this(10); //line 1
    }
    Question13(int x){
        this.x=x;
    }
}
class Car extends Question13{
    int y;
    Car(){
        super(10);  //line 2
    }
    Car(int y){
        super (y);
        this.y=y;
    }
    public String toString(){
        return super.x+ ":"+this.y;
    }

    public static void main(String[] args) {
        Question13 y = new Car(20);
        System.out.println(y);
    } //Output ===> C)20:20
}
