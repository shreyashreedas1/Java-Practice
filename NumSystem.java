import java.util.*;
class Numsys
{
   double decval=0,octal=0,binval=0;
   double str=0;
      boolean checkBinary(int n)
     {
           int  ret=0; 
           while(n>0)
           
           {
               int r=n%10;
               if(r>1)
               { 
                ret=1;
                break;
               }
               n=n/10;
           }
           if(ret==0)
           return true;
           else
           return false;
      
   }

   void decTobin()
        {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter a DECIMAL number to convert into BINARY number:");
            int dec=sc.nextInt();
            int c=0;
           while(dec>0)
               {
                  int mod=dec%2;
                  binval=mod*Math.pow(10,c)+binval;
                  dec=dec/2;
                  c++;
               }
             System.out.print("Eqv. Binary number "+binval);  
            }
   void binTodec()
   {
            int c=0;
            double decval=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Binary number to convert into decimal number:");
            int bin=sc.nextInt();
            c=0;
              {
               while(bin>0)
                {
                  int mod=bin%10;
                  decval=mod*Math.pow(2,c)+decval;
                  bin=bin/10;
                  c++;
                }
               System.out.print("Eqv. Decimal number "+decval);   
            }
   }       
        void decTooct()
        {
             Scanner sc=new Scanner(System.in);
             System.out.print("Enter dcimal value to convert octal:");  
            int dec1 = sc.nextInt();
            
            int c=0;

                while (dec1 > 0) {
                   int mod = dec1 % 10;
                    decval = mod * Math.pow(8, c) + decval;
                    dec1=dec1/10;
                    c++;
                }
                System.out.print("Eqv. Octal number of decimal number: "+octal);  
               }
        void octTodec() 
            {
                double octal=0;
                int c=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter octal num:");
               int oct=sc.nextInt();
               c=0;
               while(oct>0)
                {
                  int mod=oct%8;
                  octal=mod*Math.pow(10,c)+octal;
                  oct=oct/8;
                  c++;
                }
                System.out.println("Equivalent decimall num of octal value"+octal);
            }
            void decTohex()
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a decimal num:");
                int dec2=sc.nextInt();
               String str=" ";
               char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
               while(dec2>0)
                {
                 int mod=dec2%16;
                  str=hex[mod]+str;
                  dec2=dec2/16;
                }
                System.out.println("Equivalent hex num of decimal num:"+str);
            }
            void hexTodec()
                {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Hexadecimal value:");
               String hex_num=sc.next();
               int val=0,j=0;
               int num_len=hex_num.length();
               String str2="0123456789ABCDEF";
               for(int i=num_len-1;i>=0;i--)
               {
                   char ch=hex_num.charAt(i);
                   int ind=str2.indexOf(ch);
                   val=ind*(int)Math.pow(16,j)+val;
                   j++;
                }
               System.out.println("Decimal value of hex num"+val);
       }
       public static void main(String s[])
           {  
            Numsys ob=new Numsys();
            int choice;
            do{
             Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter your choice:");
            System.out.println("Press 1 for Decimal to Binary\nPress 2 for binary to decimal\nPress 3  OCTAL to Decimal\nPress 4 for Decimal to octal\nPress 5 for DECIMAL to HEXADECIMAL\nPress 6 for HEXADECIMAL to DECIMAL\n");
             choice=sc.nextInt();
                switch(choice)
                 {
               case 1: ob.decTobin();          
                       break; 
               case 2: ob.binTodec();
                       break;
               case 3: ob.decTooct();
                       break;
               case 4: ob.octTodec();
                       break;
               case 5: ob.decTohex();
                       break;
               case 6: ob.hexTodec();
                       break;
               default: System.out.print("Invalid Choice "); 
            }
            }
    while(choice!=7);
}
}