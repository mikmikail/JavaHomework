package December13th2022;

public class December13th2022Part4 {
    public static void main(String[] args) {
        Question21to30 questions = new Question21to30();
      

    }
}
class Question21to30{
    Question21to30(){
        System.out.println("TUESDAY DECEMBER 13th,2022-BY ");
        System.out.println("=============");
    }
    int Q21(int a, int b, int c){
    /*Given three int values, a b c, return the largest.
        intMax(1, 2, 3) → 3
        intMax(1, 3, 2) → 3
        intMax(3, 2, 1) → 3*/
if(a>b&a>c){
    return a;
}else if (b>a&b>c) {
    return b;
}else {return c;}
    }
    int Q22(int a,int b){
        /*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
        Note that Math.abs(n) returns the absolute value of a number.
        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0*/
int res1 = Math.abs((a-10));
int res2 = Math.abs((b-10));
if(res1<res2){
        return a;}
else if (res2<res1){
    return b;}
else return 0;
}
    boolean Q23(int a , int b ){
        /*Given 2 int values, return true if they are both in the range 30..40 inclusive,
        or they are both in the range 40..50 inclusive.
        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true
*/
if ((a>=30&a<=40)&(b>=30&b<=40)){
    return true;
}else {
    if((a>=40&a<=50)&(b>=40&b<=50)){
        return true;
    }else {
        return false;
    }
}
    }
    int Q23Part2(int a , int b){
        /*Given 2 positive int values, return the larger value that is in the range
         10..20 inclusive, or return 0 if neither is in that range.
        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11*/
        if((a>=10&a<=20)&(b>=10&b<=20)){
            return Math.max(a, b);
        }else if((a>=10&a<=20)) return a;
        else if ((b>=10&b<=20)) return b;
        else return 0;
    }
    boolean Q24(int a , int b){
        /*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
        Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true*/
        return (a%10)==(b%10);
    }
    int Q25(int []a){
        /* Given an array of ints, return the number of 9's in the array.
        arrayCount9([1, 2, 9]) → 1
        arrayCount9([1, 9, 9]) → 2
        arrayCount9([1, 9, 9, 3, 9]) → 3*/
        int counter=0;
        for (int j : a) {
            if (j == 9) {
                ++counter;
            }
        }
        return counter;
    }
    boolean Q26(int []a){
        /*Given an array of ints, return true if one of the first 4 elements
         in the array is a 9. The array length may be less than 4.
        arrayFront9([1, 2, 9, 3, 4]) → true
        arrayFront9([1, 2, 3, 4, 9]) → false
        arrayFront9([1, 2, 3, 4, 5]) → false*/
        for (int i=0; i<a.length&i<4;i++) {
            if (a[i] == 9) {
                return true;
            }
        }
return false;
    }
    boolean Q27(int []a){
        /*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
        array123([1, 1, 2, 3, 1]) → true
        array123([1, 1, 2, 4, 1]) → false
        array123([1, 1, 2, 1, 2, 3]) → true*/
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                ++i;
                if(i>a.length-1){
                    break;
                }else if(a[i]==2){
                    ++i;
                    if(i>a.length-1){
                        break;
                    }else if (a[i]==3){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    int Q28 (int[]a){
        /*Given an array of ints, return the number of times that two 6's are
         next to each other in the array. Also count instances where the second "6" is actually a 7.
        array667([6, 6, 2]) → 1
        array667([6, 6, 2, 6]) → 1
        array667([6, 7, 2, 6]) → 1*/
        int counter=0;
        for (int i=0;i<a.length;i++){
           if(a[i]==6){
               ++i;
               if(i>a.length) {
                   break;}else if (a[i]==6|a[i]==7) {
                   counter++;
               }
               }
           }
        return counter;
        }
    boolean Q29 (int []a){
        /*Given an array of ints, we'll say that a triple is a value appearing
        3 times in a row in the array. Return true if the array does not contain any triples.
        noTriples([1, 1, 2, 2, 1]) → true
        noTriples([1, 1, 2, 2, 2, 1]) → false
        noTriples([1, 1, 1, 2, 2, 2, 1]) → false*/
        for (int i=2;i<a.length;i++){
                if((a[i-1]==a[i-2])&(a[i] == a[i-1])){
                    return false;
                }
        }
        return true;
    }
    boolean Q30 (int []a){
        /*Given an array of ints, return true if it contains a 2, 7, 1 pattern:
        a value, followed by the value plus 5, followed by the value minus 1.
        Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.
        has271([1, 2, 7, 1]) → true
        has271([1, 2, 8, 1]) → false
        has271([2, 7, 1]) → true*/
        for (int i=0;i<=a.length-1;i++){
            if(i+2<a.length&i+1<a.length){
            if (a[i + 1] == a[i] + 5) {
                    if (a[i + 2] == a[i] - 1 | a[i + 2] == a[i] - 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    }



