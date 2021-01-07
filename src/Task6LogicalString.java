/*
Create an application to toggle the case of each character of given inputString.
example:
       input = "Hello World"
       output = hELLO wORLD
 */
import java.util.Arrays;
import java.util.Scanner;

public class Task6LogicalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        Task6LogicalString obj = new Task6LogicalString();
        obj.CaseToggle(str);
    }
    public void CaseToggle(String s){
        for(int i = 0; i < s.length(); i++){
            int r = s.charAt(i);
            if(r>=65 && r<=90){
                r += 32;
                System.out.print((char)r);
            }
            else if(r>=97 && r<=122){
                r -= 32;
                System.out.print((char)r);
            }
            else{
                System.out.print((char)r);
            }
        }
    }
}
