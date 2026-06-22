// This program simulates a button game where the user can press one of three buttons to receive a greeting in different languages.

//using switch statement
import java.util.*;
public class ButtonGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button;
        System.out.println("Enter a button number (1, 2, or 3):");
        button = sc.nextInt();
        switch(button){
            case 1:
                System.out.println("Hello.");
                break;
            case 2:
                System.out.println("Namaste.");
                break;
            case 3:
                System.out.println("Hola.");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}