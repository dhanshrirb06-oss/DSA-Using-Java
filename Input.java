// This program demonstrates how to take user input in Java
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name:");//prompting user to enter their name
        name = sc.nextLine();
        System.out.println(name);
        //addition of two numbers
        int a,b;
        System.out.println("Enter two numbers:");//prompting user to enter two numbers
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a+b;//calculating the sum of two numbers
        System.out.println("Addition of two numbers is:"+sum);//printing the sum of two numbers
        sc.close();
    }
}
