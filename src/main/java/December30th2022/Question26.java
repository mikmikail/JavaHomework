package December30th2022;

public class Question26 {
    Character c;
    boolean b;
    float f;
    void printAll (){
        System.out.println("c = "+c);
        System.out.println("b = "+b);
        System.out.println("f = "+f);
    }

    public static void main(String[] args) {
        Question26 f = new Question26();
        f.printAll();
    }       //Output ===> C)c = null
                       //   b = false
    //                      f = 0.0
}
