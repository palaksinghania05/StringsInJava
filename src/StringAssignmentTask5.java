/*
TASK 5
Print any given inputString in following format.
        Input --> "Hello"
        Output -->
        index:  0   1   2   3   4
        chars:  H   e   l   l   o
        Every character is separated by tab, use "\t" for inserting tab.
*/
import java.util.Scanner;

public class StringAssignmentTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String newString = sc.nextLine();
        //directly calling the function as both methods are static
        StringOutput(newString);
        sc.close();
    }
    public static void StringOutput(String str) {
        System.out.print("Index: ");
        for(int i = 0; i < str.length(); i++){
            // '\t' is used for inserting tab
            System.out.print(i + "\t");
        }
        //line change
        System.out.println();
        System.out.print("Chars: ");
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "\t");
        }
    }
}
