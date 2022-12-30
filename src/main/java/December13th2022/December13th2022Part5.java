package December13th2022;

import java.util.Arrays;

public class December13th2022Part5 {
    public static void main(String[] args) {
        Questions31to44 questions = new Questions31to44();

    }
}
class Questions31to44 {
    Questions31to44(){
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    boolean Q31(int [] a){
        /*Given an array of ints, return true if 6 appears as either the first or last element in the array.
        The array will be length 1 or more.
        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false*/
            return a[0]==6 | a[a.length - 1]== 6;
    }
    boolean Q32(int []a){
        /*Given an array of ints, return true if the array is length 1 or more,
         and the first element and the last element are equal.
        sameFirstLast([1, 2, 3]) → false
        sameFirstLast([1, 2, 3, 1]) → true
        sameFirstLast([1, 2, 1]) → true*/
        return a[0]==a[a.length-1];
    }
    boolean Q33 (int[]a,int []b){
        /*Given 2 arrays of ints, a and b, return true if they have the same first element
         or they have the same last element. Both arrays will be length 1 or more.
        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true*/
        return a[0]==b[0]|a[a.length-1]==b[b.length-1];

    }
    int Q34(int []a){
        /*Given an array of ints length 3, return the sum of all the elements.
        sum3([1, 2, 3]) → 6
        sum3([5, 11, 2]) → 18
        sum3([7, 0, 0]) → 7*/
        int sum=0;
        for (int i :a){
            sum +=i;
            }
        return sum;
        }
    int[] Q35(int []a){
        /*Given an array of ints length 3, return an array with the elements
         "rotated left" so {1, 2, 3} yields {2, 3, 1}.
        rotateLeft3([1, 2, 3]) → [2, 3, 1]
        rotateLeft3([5, 11, 9]) → [11, 9, 5]
        rotateLeft3([7, 0, 0]) → [0, 0, 7]*/
        int temp = a[0];
        for (int i =0 ; i<a.length-1;i++){
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        return a;
    }
    int [] Q36(int []a){
        /*Given an array of ints length 3, return a new array with
         the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]*/
        int []reverse = new int[a.length];
        int j=0;
        for (int i=a.length-1;i>=0;i--){
            reverse[j++]=a[i];
        }
        return reverse;
    }
    int [] Q37 (int []a){
        /* Given an array of ints length 3, figure out which is larger,
        the first or last element in the array, and set all the other
        elements to be that value. Return the changed array.
        maxEnd3([1, 2, 3]) → [3, 3, 3]
        maxEnd3([11, 5, 9]) → [11, 11, 11]
        maxEnd3([2, 11, 3]) → [3, 3, 3]*/
        int i=Math.max(a[0],a[a.length-1]);
        Arrays.fill(a, i);
        return a;
    }
    int Q38(int []a){
        /*Given an array of ints, return the sum of the first 2 elements in the array.
        If the array length is less than 2, just sum up the elements
        that exist, returning 0 if the array is length 0.
        sum2([1, 2, 3]) → 3
        sum2([1, 1]) → 2
        sum2([1, 1, 1, 1]) → 2*/
        int [] b=Arrays.copyOf(a,2);
        return b[0]+b[1];
    }
    int[] Q39(int []a,int[]b){
        /*Given 2 int arrays, a and b, each length 3, return a new array
         length 2 containing their middle elements.
        middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/
        int []c=new int[3];
        int []d=new int [3];
        c=a;
        d=b;
        return new int[]{c[1], d[1]};
    }
    int [] Q40(int[]a){
        /*Given an array of ints, return a new array length 2 containing
         the first and last elements from the original array.
         The original array will be length 1 or more.
        makeEnds([1, 2, 3]) → [1, 3]
        makeEnds([1, 2, 3, 4]) → [1, 4]
        makeEnds([7, 4, 6, 2]) → [7, 2]*/
        return new int[]{a[0],a[a.length-1]};
    }
    boolean Q41(int []a){
        /*Given an int array length 2, return true if it contains a 2 or a 3.
        has23([2, 5]) → true
        has23([4, 3]) → true
        has23([4, 5]) → false*/
        int []b=Arrays.copyOf(a,2);
        return b[0]==2|b[1]==2|b[0]==3|b[1]==3;
    }
    boolean Q42(int []a){
        /*Given an int array length 2, return true if it does not contain a 2 or 3.
        no23([4, 5]) → true
        no23([4, 2]) → false
        no23([3, 5]) → false*/
        int []b=Arrays.copyOf(a,2);
        return (b[0]!=2&b[1]!=2)&(b[0]!=3&b[1]!=3);
    }
    int [] Q43 (int []a){
        /* Given an int array, return a new array with double the length where its last element
         is the same as the original array, and all the other elements are 0.
         The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]*/
        int[] b =new int[a.length*2];
        b[b.length-1]=a[a.length-1];
        return b;
    }
    boolean Q44(int []a){
        /*Given an int array, return true if the array contains 2 twice,
         or 3 twice. The array will be length 0, 1, or 2.
        double23([2, 2]) → true
        double23([3, 3]) → true
        double23([2, 3]) → false*/
        int []b = new int [2];
        b[0]=a[0];
        b[1]=a[1];
        return (b[0]==2&b[1]==2)|(b[0]==3&b[1]==3);
    }

    }



