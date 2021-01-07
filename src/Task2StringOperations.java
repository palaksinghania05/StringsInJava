/*
Print all the characters of given inputString in the below format:
input: Hello World
output: H,e,l,l,o, ,W,o,r,l,d
 */
import java.util.Scanner;

public class Task2StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = sc.nextLine();
        for(int i = 0; i < inputString.length(); i++) {
            System.out.print(inputString .charAt(i));
            //controlling the printing of comma
            if(i != inputString.length()-1){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
