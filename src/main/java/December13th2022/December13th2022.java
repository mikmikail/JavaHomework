package December13th2022;

import java.util.Arrays;
import java.util.Scanner;

public class December13th2022 {
    public static void main(String[] args) {
        QuestionDec13 questions = new QuestionDec13();

    }
}

class QuestionDec13 {
    public QuestionDec13() {
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    double Q1(double km) {
        /*write a method that can convert km to miles
            1 km = 0.612 miles*/
        return 0.612 * km;
    }
    double Q2(double G) {
        /*write a method that can convert gallons to litters
            1 G = 3.75 L*/
        return G * 3.75;
    }
    public void Q3() {
        int[] Q3Array = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Arrays.sort(Q3Array);
        int[] ReverseArray = new int[Q3Array.length];
        int j = Q3Array.length - 1;
        for (int i : Q3Array) {
            ReverseArray[j] = i;
            j--;
        }
        System.out.println(Arrays.toString(ReverseArray));
    }
    void Q4() {
        /*write a method that accepts 3 parameters: 2 numbers and one operator,
	 	and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLS enter your first parameter :");
        int a = scanner.nextInt();
        System.out.println("PLS enter your second parameter :");
        int b = scanner.nextInt();
        System.out.println("PLS put your operator :");
        String op = scanner.next();
        /*if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))) {
            System.out.println("PLS PUT APPROPRIATE OPERATOR");
        }*/
        switch (op) {
            case "+" -> System.out.println("The result is " + (a + b));
            case "-" -> System.out.println("The result is " + (a - b));
            case "*" -> System.out.println("The result is " + (a * b));
            case "/" -> System.out.println("The result is " + (a / b));
            case "%" -> System.out.println("The result is " + (a % b));
            default -> System.out.println("\\\\ CHANGE OPERATOR //");
        }
        scanner.close();
    }
    void Q5(int score) {
        /*write a method that can calculate grade
			if score is 100 ~ 90 ==> A
			if score is 89 ~ 80 ==> B
			if score is 79 ~ 70 ==> C
			if score is 69 ~ 60 ==> D
			if score is 0 ~ 59 ==> F
			otherwise ==> Invalid Score*/

        if (score >= 90 && score <= 100) System.out.println(score + " YOUR GRADE IS A");
        else if (score >= 80 && score <= 89) System.out.println(score + " YOUR GRADE IS B");
        else if (score >= 70 && score <= 79) System.out.println(score + " YOUR GRADE IS C");
        else if (score >= 60 && score <= 69) System.out.println(score + " YOUR GRADE IS D");
        else if (score >= 0 && score <= 59) System.out.println(score + " YOUR GRADE IS F");
        else System.out.println("INVALID SCORE !");
    }
    void Q6() {
        /*Write a Java method to multiply corresponding elements of two arrays of integers.
        Sample input:
        Array1: [1, 3, -5, 4]
        Array2: [1, 4, -5, -2]  */
        int[] Q6Array1 = {1, 3, -5, 4};
        int[] Q6Array2 = {2, 4, -5, -2};
        for (int i : Q6Array1) {
            for (int j : Q6Array2) {
                System.out.print(i + "*" + j + "=" + i * j + "\t ");
            }
            System.out.println();
        }
    }
    void Q7(int n){
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = (n * 3 + 1) / 2;
                System.out.println(n);
            }
        }
        /*void Q7(int n) {
        if (n % 2 == 0) {
            while (n > 0) {
                n /= 2;
                System.out.println(n);
            }
        }
        if (n % 2 == 1) {
            while (n > 1) {
                n = (3 * n + 1);
                System.out.println(n);
                if (n % 2 == 0) {
                    while (n > 0) {
                        n /= 2;
                        System.out.println(n);
                    }
                }
            }
        }
    }*/
        }
    void Q8(int number){
        /*Write a Java program to check if a number is Armstrong's number or not? */
        int temp,remainder,n=0;
        temp=number;
        double result=0;
        while(temp !=0){ temp/=10;
            n++;}
            temp=number;
        while(temp >0){
            remainder=temp%10;
            result += Math.pow(remainder,n);
            temp/=10;
           }
        if(result==number){
            System.out.println("Armstrong Number :"+number);
            }else {
            System.out.println("Number: "+number+" is not Armstrong.");
        }
        }

}

