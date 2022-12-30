package December29th2022;

public class Question20 {
    int a1;
    public static void doProduct(int a){
        a = a*a;
    }
    public static void doString(String s){
        s.concat(" "+s);
    }

    public static void main(String[] args) {
        Question20 item = new Question20();
        item.a1=11;
        String sb ="Hello";
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+" "+sb+" "+ item.a1);
    } //Output ===> E) 10 Hello 11
}
