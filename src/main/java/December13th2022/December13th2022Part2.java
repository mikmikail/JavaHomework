package December13th2022;

import java.util.Scanner;

public class December13th2022Part2 {
    public static void main(String[] args) {
        Question1to10 questions = new Question1to10();
        
    }
}
class Question1to10 {
    Question1to10() {
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    void Q1MaxNum() {
        /*Define two methods to print the maximum and
        the minimum number respectively among three numbers entered by user.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put 3 numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 > num2 & num1 > num3) {
            if(num2>num3)
            System.out.println(num1 + " > " + num2 + " > " + num3);
            else System.out.println(num1 + " > " + num3 + " > " + num2);
        } else if (num2 > num1 & num2 > num3) {
            if(num3>num1)
            System.out.println(num2 + " > " + num3 + " > " + num1);
            else System.out.println(num2 + " > " + num1 + " > " + num3);
        } else if (num3 > num1 & num3 > num2) {
            if(num1>num2)
            System.out.println(num3 + " > " + num1 + " > " + num2);
            else System.out.println(num3 + " > " + num2 + " > " + num1);
        }
        System.out.println("COOL");
        scanner.close();
    }
    void Q1MinNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put 3 numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1<num2&num1<num3){
            if(num2<num3) System.out.println(num1+"<"+num2+"<"+num3);
            else System.out.println(num1+"<"+num3+"<"+num2);
        }
        if (num2<num1&num2<num3){
            if(num1<num3)System.out.println(num2+"<"+num1+"<"+num3);
            else System.out.println(num2+"<"+num3+"<"+num1);
        }
        if(num3<num1&num3<num2){
            if (num2<num1)System.out.println(num3+"<"+num2+"<"+num1);
            else System.out.println(num3+"<"+num1+"<"+num2);
        }
        scanner.close();
    }
    void Q2(int number){
        /*Define a program to find out whether a given number is even or odd.*/
        if (number%2==0) System.out.println("The number is even");
        else if (number%2==1) System.out.println("The number is odd");
    }
    void Q3(int age) {
        if (age >= 18) {
            /*A person is elligible to vote if
            his/her age is greater than or equal to 18.
            Define a method to find out if he/she is elligible to vote.
             */
            System.out.println("Eligible to vote");
        } else if (age < 18) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Put proper something");
        }

    }
    void Q4(){
        /*Write a program to print the sum of
        two numbers entered by user by defining your own method.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put 2 numbers :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Total: "+(num1+num2));
        scanner.close();
    }
    int[] Q5(){
        /*Define a method that returns the product of
        two numbers entered by user.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put 2 numbers :");
        int[] num = new int[2];
        num[0] = scanner.nextInt();
        num[1]= scanner.nextInt();
        scanner.close();
        return num;
    }
    void Q6(){
        /*Write a program to print the circumference and area of a circle of
        radius entered by user by defining your own method.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put radius :");
        double r = scanner.nextInt();
        double area =((22/7)*r*r);
        double cf=(2*(22/7)*r);
        System.out.println("Area of your circle :"+area);
        System.out.println("Circumference of your circle :"+cf);
        scanner.close();
    }
    void Q7(int num) {
        boolean flag = false;
        if (num == 0 || num == 1) System.out.println("It's not prime number: " + num);
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("This is not Prime number: " + num);
        } else {
            System.out.println("This is a Prime Number: " + num);
        }
    }
    void Q8(){
        /*Write a program which will ask the user to enter his/her marks (out of 100).
        Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put your mark :");
        int mark = scanner.nextInt();
        if (mark>=91&mark<=100){
            System.out.println("Your grade for "+mark+" is AA.");
        }else if (mark>=81&mark<=90) {
            System.out.println("Your grade for " + mark + " is AB.");
        }else if (mark>=71&mark<=80) {
            System.out.println("Your grade for " + mark + " is BB.");
        }else if (mark>=61&mark<=70) {
            System.out.println("Your grade for " + mark + " is BC.");
        }else if (mark>=51&mark<=60) {
            System.out.println("Your grade for " + mark + " is CD.");
        }else if (mark>=41&mark<=50) {
            System.out.println("Your grade for " + mark + " is DD.");
        }else if (mark>=0&mark<=40) {
            System.out.println("Your grade for " + mark + " is FAIL.");
        }else {
            System.out.println("Put appropriate mark.");
        }
        scanner.close();
    }
    boolean Q9(boolean weekday,boolean vacation){
        /*9- The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
        sleepIn(false, false) → true
        sleepIn(true, false) → false
        sleepIn(false, true) → true*/
        /*boolean sleepIn;
        if (vacation.equalsIgnoreCase("vacation")&!weekday.equalsIgnoreCase("weekday")) {
          sleepIn=true;
        } else if (!vacation.equalsIgnoreCase("vacation")&!weekday.equalsIgnoreCase("weekday")) {
                sleepIn=true;
            } else {
            sleepIn=false;
        }*/
        if(weekday &!vacation)return false;
        else return true;

    }
    boolean Q10(boolean aSmile,boolean bSmile){
        /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling.
        Return true if we are in trouble.
        monkeyTrouble(true, true) → true
        monkeyTrouble(false, false) → true
        monkeyTrouble(true, false) → false*/
        /*boolean trouble;
        if (!aSmile.equalsIgnoreCase("smile")&!bSmile.equalsIgnoreCase("smile")){
            trouble=true;
        }else if(aSmile.equalsIgnoreCase("smile")&bSmile.equalsIgnoreCase("smile")) {
            trouble=true;
        }else {
            trouble =false;
        }
        return trouble;*/
        if (aSmile&!bSmile|!aSmile&bSmile)return false;
        else return true;

    }
}
