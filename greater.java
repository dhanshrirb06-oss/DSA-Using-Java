// This program compares two numbers and prints the greater one


import java.util.*;
public class greater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers:");//taking input of two numbers
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==b){
            System.out.println("Both are equal.");//if both numbers are equal
        }
        
        else if(a>b){
            System.out.println("Greater number is:"+a);//if a is greater than b
        }
        else{
            System.out.println("Gresater number is:"+b);//if b is greater than a
        }

    }
}
