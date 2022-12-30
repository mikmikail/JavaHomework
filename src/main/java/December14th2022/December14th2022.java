package December14th2022;

public class December14th2022 {
    public static void main(String[]args){
        StringQuestions questions = new StringQuestions();

    }
}
class StringQuestions{
    StringQuestions(){
        System.out.println("WEDNESDAY DECEMBER 14th,2022-BY ");
        System.out.println("=============");
    }
    String Q1 (String word){
        /*Given a string, return a new string made of 3 copies of the last 2 chars of the
         original string. The string length will be at least 2.
        Examples :
        "Clarusway" → "ayayay"
        "Florida" → "dadada"
        "Hi" → "HiHiHi"*/
        word =word.substring(word.length()-2);
        return word.repeat(3);
    }
    boolean Q2(String word){
        /*Given a string, return true if it’s ending with ‘a’. Otherwise return false. The string length will be at least 2.
        Examples :
        Apple –> false
        Canada –> true*/
        return (word.charAt(word.length()-1)=='a');
    }
    int Q3 (String word){
        /*Given a string, return the first index number of ‘a’. If there is no ‘a’ return -1.
        Examples :
        “Washington” → 1
        “New York” → -1
        “America” → 0*/
        if (word.contains("A")){
            return word.indexOf("A");}
        return word.indexOf("a");
    }
    void Q4(){
        /*Given a string, replace all is with was.
        Examples :
        “My name is Rajendra. My name is lamror. My name is Technolamror." →
         “My name was Rajendra. My name was lamror. My name was Technolamror."*/
        String input ="My name is Rajendra. My name is lamror. My name is Technolamror.";
        System.out.println("Given String : "+input);
        System.out.println("Output : "+input.replaceAll("is", "was"));
    }
    void Q5(){
        /*Given a string, remove the spaces between words.
        Examples :
        “My name is Arthur. I am 20 years old.” →”MynameisArthur.Iam20yearsold.”*/
        String input ="My name is Arthur. I am 20 years old.";
        System.out.println(input.replaceAll(" ",""));
    }
    String Q6(String input){
        /*Given a string, split it from ‘:’ and return the new string.
        If there is no ‘:’ return “There is no ‘:’ in the string”.
        Examples :
        “Name : Daniel” → “NameDaniel”
        “My name is Deniel” → “There is no ‘:’ in the string”*/
        if (input.contains(":")){
            input=input.replace(":","");
            input=input.replaceAll(" ","");
            return input;
        }
        return "There is no :";
    }
    String Q7 (String word){
        /*Given a string, return the new string after converting all char in string lower case.
        Examples :
        “New York City” → “new york city”*/
        return word.toLowerCase();
    }
    String Q8 (String word){
        /*Given a string, return the new string after converting all char in string UPPER case.
        Examples :
         “New York City” → “NEW YORK CITY”*/
        return word.toUpperCase();
    }
    String Q9(String word){
        /*Given a string, return the length of the string.
        Examples :
        “Clarusway SDET Course” → “The String length is 22”
        “New York” → The String length is 8”*/
        return "The String length is "+word.length();
    }
    String Q10 (String word1 , String word2, String word3,String word4){
        /*Given 3 or 4 strings, return the new string after concatenation.
        Examples :
        New
        York
        City
        → “New York City”
        My
        Name
        Is
        Alex
        → “My name is Alex”*/
        return word1.concat(" "+word2).concat(" "+word3).concat(" "+word4);
    }

}