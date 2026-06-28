/*
Inverted Half Pyramid :

*****
****
***
**
*

*/

import java.util.*;
public class InvertedHalfPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        //for loop 
        for(i=1;i<=n;i++)//Outer for loop
        {
            for(j=i;j<=n;j++)//Inner for loop
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
