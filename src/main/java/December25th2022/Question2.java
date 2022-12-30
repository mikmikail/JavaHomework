package December25th2022;

public class Question2 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = (j += i) / 5;
        System.out.println(i + " : " + j + " : " + k); //Output ===> A)10 : 30 : 6
    }
}
