package December31st2022;

public class Question39 {
    String type ="Canine";
    int maxSpeed = 60;
    Question39(){}
    Question39(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}
class WildAnimal extends Question39{
    String bounds ;
    WildAnimal (String bounds){
        // line n1
    }
    WildAnimal(String type, int maxSpeed,String bounds){
        //line n2
    }

    public static void main(String[] args) {
        WildAnimal wolf = new WildAnimal("Long");
        WildAnimal tiger = new WildAnimal("Feline",80,"short");
        System.out.println(wolf.type+" "+wolf.maxSpeed+" "+wolf.bounds);
        System.out.println(tiger.type+" "+tiger.maxSpeed+" "+tiger.bounds);
    }  //       Answer ===> A) E)
}
