/*
Print the length of input string.
Accept the input string from the user.
 */
//space is also treated as a character.
import java.util.Scanner;

public class Task1StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        int length = inputString.length();
        System.out.println("Length of the string =  " + length);
        sc.close();
    }
}
