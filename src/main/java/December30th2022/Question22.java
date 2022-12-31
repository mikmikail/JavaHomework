package December30th2022;

public class Question22 {
    public static void main(String[] args) {
        int ans;
        try {
            int num=10;
            int div=0;
            ans=num/div;
        }catch (ArithmeticException ae){
            ans=0;      //line n1
        }catch (Exception e){
            System.out.println("Invalid Calculation");
        }
       // System.out.println("Answer = "+ans); //line n2
    }
}           //Output ===> D) Compilation fails only at line n2.
