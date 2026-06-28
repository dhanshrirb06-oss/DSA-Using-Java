/*
# Half Pyramid with Numbers:

1
12
123
1234
12345

*/

public class HalfNoPyramid 
{
    public static void main(String[] args) 
    {
        int n=5,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
