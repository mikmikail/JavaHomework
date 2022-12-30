package December13th2022;

public class December13th2022Part3 {
    public static void main(String[] args) {
        Questions11to20 questions = new Questions11to20();

    }
}

class Questions11to20 {
    Questions11to20() {
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    int Q11(int a, int b) {
        /*Given two int values, return their sum. Unless the two values are the same, then return double their sum.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/
        int res = a + b;
        if (a == b) {
            res *= 2;
        }
        return res;
    }
    boolean Q12(boolean talk, int h) {
        /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20.
        Return true if we are in trouble.
        parrotTrouble(true, 6) → true
        parrotTrouble(true, 7) → false
        parrotTrouble(false, 6) → false*/
        return talk & ((h < 7) | h > 20);
    }
    boolean Q13(int a, int b) {
        /*Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
        makes10(9, 10) → true
        makes10(9, 9) → false
        makes10(1, 9) → true*/
        return a == 10 | b == 10 | (a + b) == 10;
    }
    boolean Q14(int n) {
        /*Given an int n, return true if it is within 10 of 100 or 200.
        Note: Math.abs(num) computes the absolute value of a number.
        nearHundred(93) → true
        nearHundred(90) → true
        nearHundred(89) → false*/
        return 100 >= Math.abs(n) & Math.abs(n) >= 90 | 200 >= Math.abs(n) & Math.abs(n) >= 190;
    }
    boolean Q15(int a, int b, boolean c) {
        /*Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.
        posNeg(1, -1, false) → true
        posNeg(-1, 1, false) → true
        posNeg(-4, -5, true) → true*/
        if (a > 0 & b < 0) return true;
        else if (a < 0 & b > 0) return true;
        else if (a < 0 & b < 0 & c == true) return true;
        else return false;
    }
    String Q16(String word) {
        if (word.contains("not")) {
            return word;
        } else {
            return "not " + word;
        }
    }
    boolean Q17(int num) {
        /*Return true if the given non-negative number is a
         multiple of 3 or a multiple of 5. Use the % "mod" operator
            or35(3) → true
            or35(10) → true
            or35(8) → false*/
        return num % 3 == 0 | num % 5 == 0;
    }
    boolean Q18(int temp1, int temp2) {
        /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false*/
     return (temp1<0|temp1>100)&(temp2<0|temp2>100);
    }
    boolean Q19(int num1,int num2){
        /*Given 2 int values, return true if either of them is in the range 10..20 inclusive.
        in1020(12, 99) → true
        in1020(21, 12) → true
        in1020(8, 99) → false*/
        return (num1 >= 10 & num1 <= 20) | (num2 >= 10 & num2 <= 20);
    }
    boolean Q20(int num1 , int num2, int num3){
        /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 3 int values, return true if 1 or more of them are teen.
        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true*/
        return num1>=13&num1<=19|num2>=13&num2<=19|num3>=13&num3<=19;
    }
}

