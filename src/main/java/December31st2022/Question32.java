package December31st2022;

import December25th2022.Question7;

public class Question32 {
    int i ;
    static int j;

    public static void main(String[] args) {
            Question32 x1 = new Question32();
            Question32 x2 = new Question32();
            x1.i = 3;
            x1.j = 4;
            x2.i = 5;
            x2.j = 6;
            System.out.println(
                    x1.i + " " +
                            x1.j + " " +
                            x2.i + " " +
                            x2.j);
            // Output ===> D) 3 6 5 6
    }
}
