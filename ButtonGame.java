/*Button Game: Write a program that simulates a simple button game. 
The program should prompt the user to enter a button number (1, 2, or 3).
 Based on the button pressed, the program should display a corresponding message.
  For example, if the user presses button 1, it could display "Hello." 
  If they press button 2, it could display "Namaste." 
  If they press button 3, it could display "Hola." 
  If the user enters an invalid button number, the program should display an error message.*/

//using if-else statement
  import java.util.*;
public class ButtonGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button;
        System.out.println("Enter button(1/2/3):");
        button = sc.nextInt();
        if(button == 1){
            System.out.println("Hello.");
        }
        else if(button == 2){
            System.out.println("Namaste.");
        }
        else if(button == 3){
            System.out.println("Hola.");
        }
        else{
            System.out.println("Invalid button.");
        }
    }
}
