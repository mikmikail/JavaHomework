package December31st2022;

public class Question33 {
    String name ;
    boolean contract;
    double salary;
    Question33 (){
        //line n1

    }
    public String toString(){
        return name + ":"+contract+":"+salary;
    }

    public static void main(String[] args) {
        Question33 e = new Question33();
        //line n2

        System.out.print(e);
    }       // Output ===> A) C)
}
