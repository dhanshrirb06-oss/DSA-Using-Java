// This program calculates the sum of natural numbers from 1 to nwhere n is a positive integer entered by the user
import java.util.*;
public class SumNaturalNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,sum = 0;
        System.out.println("Enter a positive integer:");//prompting user to enter a positive integer
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            sum+=i;//calculating the sum of natural numbers from 1 to n
        }
        System.out.println("The sum of natural numbers from 1 to "+ n +" is:"+sum);
    }
}
