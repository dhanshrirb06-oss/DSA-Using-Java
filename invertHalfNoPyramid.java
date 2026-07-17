/*

12345
1234
123
12
1

*/
public class invertHalfNoPyramid 
{
    public static void main(String[] args) 
    {
        int n= 5,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
