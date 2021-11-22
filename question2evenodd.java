package assignement2;

import java.util.*;

public class question2evenodd
{
    public static void main (String args[])
    {
        int a,b,sum=0;
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the starting value :");
        a= scn.nextInt();

        System.out.println("enter the ending value :");
        b= scn.nextInt();

        for(int i=a;i<=b;i+=2)
        {
            if (a % 2 == 0)
            {
                sum =sum+i;
            }
        }
        System.out.println("sum of all even number will be = "+sum );
    }
}
