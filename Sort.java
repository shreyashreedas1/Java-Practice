import java.util.*;
class asc_sort
{
    int size;
    int arr[]=new int[100];
    int i,j;
        public  void input()
            {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of elements you want to sort:");
      size=sc.nextInt();
      System.out.println("Enter Elements for ascending order sorting:");
    
      for( i=0;i<size;i++)
                {
        arr[i]=sc.nextInt();
        }
   }
   public void sort()
   {
       int temp;
      
       for( i=0;i<size;i++)
       {
           for(j=0;j<size-1;j++)
           {
               if(arr[j]>arr[j+1])
               {
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }   
            }
        }
    }
            public void display()
        {
            //int size=0;int arr[]=new int[100];
            System.out.println("After sorting array will be:");
    
            for(i=0;i<size;i++)
            {
                System.out.println(" "+arr[i]);
            }
        }
        public static void main(String[] args)
            {
             asc_sort ob=new asc_sort();
             ob.input();
             ob.sort();
            ob.display();
            }
}   
    
    
    
    
    