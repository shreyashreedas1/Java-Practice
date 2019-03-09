import java.util.*;
public class sum_sub

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int i,j,r,c;
        System.out.print("Enter number of rows and columns:");
        r =sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int sum[][]=new int[r][c];
        int sub[][]=new int[r][c];
        System.out.print("Enter elements of 1st matrics row wise:");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter elements of 2nd matrics row wise:");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j]  ;
            }
        }
        System.out.print("\nSum of entered matricses:\n");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();

        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sub[i][j]=a[i][j]-b[i][j]  ;
            }
        }


        System.out.print("\nSubtraction of entered matricses:\n");

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(sub[i][j]+" ");
            }
            System.out.println();

        }
    }
}