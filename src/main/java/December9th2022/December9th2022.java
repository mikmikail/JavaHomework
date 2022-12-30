package December9th2022;

import java.util.Arrays;
import java.util.Scanner;

public class December9th2022 {
    public static void main(String[] args) {
        ArrayQuestions questions = new ArrayQuestions();

    }
}
class ArrayQuestions {
    ArrayQuestions(){
        System.out.println("FRIDAY,DECEMBER 9th,2022-BY ");
        System.out.println("================");
    }
    public void Q1() {
        /* Q1
         Create a function that finds the second-smallest item in integer array;
         Input{1903,1905,1907,1961,1999,2011,2023}
         Output: 1905*/
        int[] Q1Array = {1903, 1905, 1907, 1961, 1999, 2011, 2023, 4, 5};
        Arrays.sort(Q1Array);
        System.out.println(Q1Array[1]);
        System.out.println("================");
    }
    public void Q2() {
        /*Q2
         Create a program that displays a right triangle with contents of an array
         Input{1,2,3,4}
         Output:
         1
         12
         123
         1234*/
        int[] Q2Array1 = {1, 2, 3, 4};
        for (
                int i = 0;
                i < Q2Array1.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Q2Array1[j]);
            }
            System.out.println();
        }
        System.out.println("------------");
        /*Input{A,B,C,D}
        Output
        A
        AB
        ABC
        ABCD*/
        String[] Q2Array2 = {"A", "B", "C", "D"};
        for (
                int i = 0;
                i < Q2Array2.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Q2Array2[j]);
            }
            System.out.println();
        }
        System.out.println("================");
    }
    public void Q3(int n) {
        /*Q3
        Create a program that rotates the contents of an array to the right, returning new array
        Input:{1,2,3,4,5}
        Output:{5,1,2,3,4}
        Output:{4,5,1,2,3}
         */
        // there are 2 ways to do it
        //1-Using temporary array
        //2- By reversing array

        int[] Q3Array1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Original Array : " + Arrays.toString(Q3Array1));
        for (int i = n; i > 0; i--) {
            int temp = Q3Array1[Q3Array1.length - 1];
            int j = Q3Array1.length - 1;
            for (; j > 0; j--) {
                Q3Array1[j] = Q3Array1[j - 1];
            }
            Q3Array1[0] = temp;
            //++n;
            System.out.println("New right rotated array: " + Arrays.toString(Q3Array1));
            // if(n==Q3Array1.length)break;
        }
        System.out.println("================");
    }
    public void Q4() {
            /*Example 4: Create a program that moves all the zeros in a given array to the end in place
            Input:[1,0,1,1,0,0,0,1]
            Output:[1,1,1,1,0,0,0,0] *//*
                int[] Q4Array = {1, 0, 2, 0, 3, 0, 0, 4,6,7,0};
                int counter = 0;
                int [] myArray = new int[Q4Array.length];
                for (int k : Q4Array) {
                    System.out.print(k + " ");
                }
                for (int j : Q4Array) {
                    if (j > 0) myArray[counter++] = j;
                }
                System.out.println("\n"+Arrays.toString(myArray));*/
        int[] Q4Array = {1, 0, 2, 3, 0, 0, 0, 4, 5, 0, 6, 0};
        int count = 0;
        for (int i = 0; i < Q4Array.length; i++) {
            if (Q4Array[i] > 0) {
                Q4Array[count++] = Q4Array[i];
            }
        }
        while (count < Q4Array.length) {
            Q4Array[count++] = 0;
        }
        System.out.println(Arrays.toString(Q4Array));
        System.out.println("================");
    }
    public void Q5() {
        /*Create a program that reverses an array in place
            Modify the contents of the inputted array
             Input:{1,2,3,4,5}
             Output:{5,4,3,2,1}*/
        int [] Q5Array = {1,2,3,4,5,6,7,8,9,10};
        int [] ReverseArray= new int [Q5Array.length];
        int j=0;
        for(int i = Q5Array.length-1;i>=0;i--){
            ReverseArray[j++]=Q5Array[i];
        }
        System.out.println(Arrays.toString(ReverseArray));
        System.out.println("================");
    }
    public void Q6(){
        /*Create a program using arrays that sorts a list of integers in descending order.
          Descending order is the highest value to lowest.
          In the other words if the array had the values in it 106, 26, 81, 5, 15 your program should
          ultimately have an array with 106,81,26, 15, 5 in it.
            Set up the program so that the numbers to sort are read in from the keyboard.
            Implement the following methods - getIntegers, printArray, and sortIntegers
            getIntegers returns an array of entered integers from keyboard
            printArray prints out the contents of the array
            and sortIntegers should sort the array and return a new array containing the sorted numbers
            you will have to figure out how to copy the array elements from the passed array into a new
            array and sort them and return the new sorted array.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("pls put a number for length");
        int length= scanner.nextInt();
        int[]Array =new int[length];
        System.out.println("Pls enter "+length+" number ");
        for (int i=0;i<Array.length;i++){
            Array[i]=scanner.nextInt();
        }
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
        scanner.close();
       /*  public static Scanner scanner = new Scanner(System.in);
    static int length;

    public static void main(String[] args) {
        System.out.println("put length ");
        length = scanner.nextInt();
        training arr = new training();
        int[] getIntegers = arr.getIntegers(length);
         int[] sort=arr.sortIntegers(getIntegers);
        arr.printArray(sort);


        scanner.close();
 /*       System.out.println("put length ");
        length = scanner.nextInt();
        training arr = new training();
        int[] getIntegers = arr.getIntegers(length);
        arr.printArray(getIntegers);
        arr.sortIntegers(getIntegers);

        scanner.close();
                        }

    public int[] getIntegers(int length) {
        System.out.println("put numbers ");
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = scanner.nextInt();
        }
        return myArray;
    }

    public void printArray(int[] Array) {
        for (int i=0;i< Array.length;++i){
            System.out.println("Element "+i+ " contents of "+ Array[i]);
        }

    }

    public int[] sortIntegers(int[] Array) {
        Arrays.sort(Array);
        int [] Reverse = new int[Array.length];
        int j=0;
        for(int i = Array.length-1;i>=0;i--){
            Reverse[j]=Array[i];
            j++;
        }
        System.out.println(Arrays.toString(Reverse));
        return Reverse;
    }
*/

    }

}


