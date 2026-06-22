import java.util.Scanner;
public class IfElse{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age:");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("Your are an adult.");
        }
        else{
            System.out.println("Your are not an adult.");
            
        }
    }
}