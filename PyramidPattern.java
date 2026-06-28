/*
    *
   **
  ***
 ****
*****

 */


public class PyramidPattern 
{
    public static void main(String[] args) 
    {
        int n=5,i,j;
        //Outer loop
        for(i=1;i<=n;i++)
        {
            //Inner loop -> Space prints
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");

            }

            //Inner loop -> prints *
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
