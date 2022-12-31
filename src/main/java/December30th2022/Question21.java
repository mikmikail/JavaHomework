package December30th2022;

public class Question21 {
    Question21(){
        System.out.println("Vehicle");
    }
}
class Bus extends Question21{
    Bus (){
        System.out.println("Bus");
    }
}
class Transport {
    public static void main(String[] args) {
        Question21 v= new Bus();
    }
}   //Output ===> A) Vehicle Bus