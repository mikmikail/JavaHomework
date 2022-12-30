package December25th2022;

public class Question7 {
    static int i;
    int j;

    public static void main(String[] args) {
        Question7 x1 = new Question7();
        Question7 x2 = new Question7();
        x1.i = 3;
        x1.j = 4;
        x2.i = 5;
        x2.j = 6;
        System.out.println(
                x1.i + " " +
                        x1.j + " " +
                        x2.i + " " +
                        x2.j);
        // Output ===> C) 5 4 5 6
    }
}
