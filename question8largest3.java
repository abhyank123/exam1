

package assignement2;

import java.util.Scanner;

public class question8largest3
{
    public static void main (String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter first value");
        a= scn.nextInt();
        System.out.println("enter first value");
        b= scn.nextInt();
        System.out.println("enter first value");
        c= scn.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("a will be greater among three");
        }
        else
        {
            if((b>a)&&(b>c))
            {
                System.out.println("b will be greater among three");
                System.out.println("updated code");  
            }
            else
            {
                System.out.println("c will be greater among three");
                System.out.println("updated code");
            }
        }
    }
}
