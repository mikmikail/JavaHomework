package December13th2022;

public class December13th2022Part6 {
    public static void main(String[] args) {

        Questions45to58 questions = new Questions45to58();

    }
}

class Questions45to58 {
    Questions45to58() {
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    String Q45(int week, boolean vacation) {
    /*Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat,
    and a boolean indicating if we are on vacation,
    return a string of the form "7:00" indicating when the alarm clock should ring.
    Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
    Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
    alarmClock(1, false) → "7:00"
    alarmClock(5, false) → "7:00"
    alarmClock(0, false) → "10:00"*/
        if (vacation) {
            if (week == 0 | week == 6) {
                return "\"off\"";
            } else {
                return "\"10:00\"";
            }
        }
        if (week == 0 | week == 6) {
            return "\"10:00\"";
        } else {
            return "\"07:00\"";
        }
    }
    int Q46(int a, int b, int c) {
        /*You have a green lottery ticket, with ints a, b, and c on it.
        If the numbers are all different from each other,
         the result is 0.If all of the numbers are the same, the result is 20.
         If two of the numbers are the same, the result is 10.
        greenTicket(1, 2, 3) → 0
        greenTicket(2, 2, 2) → 20
        greenTicket(1, 1, 2) → 10*/
        if (a == b & b == c) {
            return 20;
        } else if (a == b | a == c | b == c) {
            return 10;
        }
        return 0;
    }
    void Q47(int a, int b) {
        int rec = 2 * (a + b);
        int sqr = 4 * a;
        double cir = 2 * 3.14 * a * a;
        int tgl = a + b + a;
        System.out.println("Rectangular Perimeter :" + rec + "\n" + "Square Perimeter :" + sqr +
                "\n" + "Circle Perimeter :" + cir + "\n" + "Triangle Perimeter :" + tgl);
    }
    double Q48(int p, int t, int r) {
        /*Java Program to Calculate Simple Interest
        Simple Interest = (P x T x R)/100
        Where,
        P is the principal amount
        T is the time and
        R is the rate*/
        return p * t * r / 100;
    }
    int Q49(int[] a) {
        /*Write a method that returns the largest integer in the list.
        You can assume that the list has at least one element.
        input : [2,5,3,14,5,25]
        output: Largest number is : 25*/
        int max = a[0];
        for (int i : a) {
            if (max < i) max = i;
        }
        return max;
    }
    String Q50(int a) {
        if (a % 3 == 0 & a % 5 == 0) {
            return "FizzBuzz";
        } else if (a % 3 == 0) {
            return "Fizz";
        } else if (a % 5 == 0) {
            return "Buzz";
        } else {
            return "NOT PROPER NUMBER";
        }

    }
    void Q51(int a) {
        boolean flag=false;
        for (int i = 2; i <= a/2 ; i++) {
            if (a % i == 0) {
            flag=true;
            break;
            }
        }
        if(flag){
            System.out.println("It is not a prime number :"+a);
        }else {
            System.out.println("It is a prime number :"+a);
        }

    }
    int Q52(int n){
        /*Write a method that returns the sum of all even Fibonacci numbers.
        Consider all Fibonacci numbers that are less than or equal to n.
        Each new element in the Fibonacci sequence is generated by adding the previous two elements.
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...*/
        int n1=0 ,n2=2;
        int sum =n1+n2;
        while(n2<=n){
            int n3=4*n2+n1;
            if(n3>n){
                break;
            }
            n1=n2;
            n2=n3;
            sum +=n2;
        }
        return sum;
    }
    boolean Q53(int sbag,int bbag,int goal){
        /* Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
        write a method that returns true if it is possible to make a package with goal kilos of rice.*/
        boolean result = false;
        if (bbag * 5 >= goal) {
            if (sbag >= goal % 5)
                result = true;
        } else {
            if (sbag >= goal - bbag * 5) {
                result = true;
            }
        }
        return result;

    }
    boolean Q54(double n){
        /*Java Program to Check Whether a Number is Positive or Negative
        input: isPositive(12.0)  output: true
        input: isPositive(-3)  output: false
        input: isPositive(-4.3)  output: false
        input: isPositive(5.5)  output: true*/
        return n > 0;
    }
    boolean Q55(char c){
        /*Java Program to Check Whether a Character is Alphabet or Not
        input : isAlphabet('*')  output: false
        input : isAlphabet('A')  output: true
        input : isAlphabet('k')  output: true
        input : isAlphabet('#')  output: false*/
        return (c >= 65 & c <= 90) | (c >= 97 & c <= 122);
    }
    void Q56(int n ){
        /*Java Program to Generate Multiplication Table
input: multiplicationTable(5);
output:
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50*/
        for (int i=1;i<=10;i++){
            int res = n*i;
            System.out.println(n + " * " + i + " = " + res);
            }
    }
    void Q57(int n){
        int reverse=0;
        while (n!=0){
            int digit = n%10;
            reverse =reverse*10+digit;
            n/=10;
        }
        System.out.println(reverse);
    }
    void Q58(int n,int p){
        /*Java Program to Calculate the Power of a Number
        input: powerOfANumber(3,4); output: 81
        input: powerOfANumber(2,5); output: 32*/
        System.out.println((int)Math.pow(n,p));
    }
}


