package December29th2022;

public class Question17 {
    int x,y;
    public Question17(int x,int y){
        initialize(x,y);
    }
    public void initialize (int x ,int y ){
        this.x= x*x;
        this.y=y*y;
    }

    public static void main(String[] args) {
        int x=3,y=5;
        Question17 obj = new Question17(x,y);
        System.out.println(x+" "+y);
    } //Output ===>B) 3 5
}
