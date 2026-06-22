//table of a number
import java.util.*;
public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("Enter the number:" );//prompting user to enter a number
        n = sc.nextInt();
        for(i = 1;i<=10;i++){
            System.out.println(n+"  "+"X"+" "+ i +" "+" = "+n*i);

        }
    }
}
