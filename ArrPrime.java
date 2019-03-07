import java.util.*;
class ArrPrime
{
    int j,arr[],n,i;
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number you want to check?");
        n=sc.nextInt();
        arr=new int[n];
        System.out.println("Enter numbers:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        primeCheck(arr,n);
    }

    public void primeCheck(int arr[], int n)
    {
        int f;
        {
            System.out.println("Prime Numbers are:");
            for(i=0;i<n;i++)
            {   f=0;
                for(j=2;j<arr[i];j++)
                {
                    if(arr[i]%j==0)
                    {
                        f=1;
                        break;
                    }
                }
                if(f==0)
                    System.out.print(arr[i]+" ");

            }
        }
    }

    public static void main(String[] s)
    {
        ArrPrime ob=new ArrPrime();
        ob.input();
        

    }
}
