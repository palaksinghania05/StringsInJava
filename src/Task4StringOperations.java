/*
Store all the characters of given inputString in a character array char[] arr,
by defining your own method called char[] stringToArray(String inputString).
Print the array in main method(optional).
Hint: Either use
      char[] toCharArray(); //method of string class
      or
      void getChar(int srcBegin, int srcEnd, char[] dst, int dstBegin)
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task4StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        Task4StringOperations obj = new Task4StringOperations();
        char[] result1 = obj.stringToArray1(inputString);
        System.out.println("Resulting Array 1: " + Arrays.toString(result1));
        char[] result2 = obj.stringToArray2(inputString);
        System.out.println("Resulting Array 2: " + Arrays.toString(result2));
    }
    public char[] stringToArray1(String str) {
        //method 1 using getChars
        char[] response = new char[str.length()];
        str.getChars(0,str.length(),response,0);
        return response;
    }
    public char[] stringToArray2(String str) {
        //method 2 using toCharArray
        char[] response = null; //by null empty array is created
        response = str.toCharArray();
        return response;
    }
}
