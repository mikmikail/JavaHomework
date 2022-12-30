package December12th2022;

public class December12th2022 {
    public static void main(String[] args) {
        MethodQuestions questions = new MethodQuestions();
        System.out.println("Your result = "+questions.Q1(10)+" seconds");
        System.out.println(questions.Q2(5, 5));
        System.out.println(questions.Q3SquareArea(4, 5));
        System.out.println(questions.Q3STriangleArea(3, 3));
        System.out.println(questions.Q4(165400));
        System.out.println(questions.Q5(156));
    }
}

   class MethodQuestions{
    MethodQuestions(){
        System.out.println("MONDAY DECEMBER 12th,2022-BY ");
        System.out.println("=============");
    }
    public long Q1(int min){
        /*Write a method that takes an integer minutes, converts it to seconds and returns as long.*/
        int res;
        res=min*60;
        return res;
    }
    public boolean Q2(int x, int y ){
        /*Write a method that returns true when x is equal to y; otherwise return false.*/
        if(x==y){
            return true;
        }
        return false;
    }
    public int Q3SquareArea(int x,int y){
       return (x*y);
}
    public double Q3STriangleArea(int x,int h){
        /*Write a class that includes methods like getAreaSquare and getAreaTriangle and
        when you call these methods with needed parameters to calculate the area
        they should return the area values for a square and triangle*/
           return (double)(x*h)/2;
       }
    public String Q4(int id){
        /*Write a method to filter the customers with customer ID last two digits ending with 25 to 99.
        Ending with 0-24 are eligible for promotion, others are not.
        Your method should return like "Customer (customer ID = XXXXXX) is not eligible for promotion" or
        "Customer (customer ID = XXXXXX) is eligible for promotion"*/
           if (0<=(id%100)&&(id%100)<25){
               return ("CONGRATS ! COSTUMER ID "+id+" IS ELIGIBLE FOR OUR SPECIAL DISCOUNT.");
           }
           return ("SORRY ! COSTUMER ID "+id+" IS NOT ELIGIBLE FOR OUR SPECIAL DISCOUNT.");
       }
    public double Q5(double inches) {
        //Write a method that accepts a measurement value in inches and returns
        // the equivalent of the measurement value in feet.
    return inches/12;
    }
    }

