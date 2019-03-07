import java.util.*;
class NumSys

{
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
    public static void main(String s[])
    {  
        int choice;
        NumSys ns=new NumSys();
        Scanner sc=new Scanner(System.in);
        do
        {
            int c=0,mod;
            double decval=0,hexdec=0;
            double binval=0,octal=0;
            System.out.println("Enter your choice:");
            System.out.println("Press 1 for Decimal to Binary\nPress 2 for binary to decimal\nPress 3  OCTAL to Decimal\nPress 4 for Decimal to octal\nPress 5 for DECIMAL to HEXADECIMAL\nPress 6 for HEXADECIMAL to DECIMAL\nPress 7 for alternative method of hex to dec value\n");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Enter a decimal value:");
                int n=sc.nextInt();
                binval=0;c=0;
                while(n>0)
                {
                    mod=n%2;
                    binval=mod*Math.pow(10,c)+binval;
                    n=n/2;
                    c++;
                }
                System.out.println("Binary value of Decimal Number:"+(int)binval);
                break;
                case 2:
                System.out.println("Enter a binary value:");
                int num=sc.nextInt();
                c=0;
                if(ns.checkBinary(num)==true)
                {
                    while(num>0)
                    {
                        mod=num%10;
                        decval=mod*Math.pow(2,c)+decval;
                        num=num/10;
                        c++;
                    }
                    System.out.println("DECIMAL value of BINARY Number:"+(int)decval);
                }
                else
                    System.out.println("The number entered is not a valid Binay Number");
                break;
                case 3:
                System.out.println("Enter a OCTAL value:");
                int num1 = sc.nextInt();

                while (num1 > 0) {
                    mod = num1 % 10;
                    decval = mod * Math.pow(8, c) + decval;
                    num1 = num1 / 10;
                    c++;
                }
                System.out.println("DECIMAL value of OCTAL Number:" + (int) decval);
                break;
                case 4:
                System.out.println("Enter a decimal value:");
                int num2=sc.nextInt();
                octal=0;
                c=0;
                while(num2>0)
                {
                    mod=num2%8;
                    octal=mod*Math.pow(10,c)+octal;
                    num2=num2/8;
                    c++;
                }
                System.out.println("DECIMAL value of OCTAL Number:"+(int)octal);
                break;
                case 5:
                System.out.println("Enter a decimal value:");
                int num3=sc.nextInt();
                String str=" ";
                char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                while(num3>0)
                {
                    mod=num3%16;
                    str=hex[mod]+str;
                    num3=num3/16;
                }
                System.out.println("HEXADECIMAL value of Decimal Number:"+str);
                break;
                case 6:
                System.out.println("Enter a HEXADECIMAL value:");
                String num4=sc.next();
                int len=num4.length();
                double str1=0;
                int dig=0,k=0;
                for( int i=len-1;i>=0;i--)
                { 
                    char ch=num4.charAt(i);
                    System.out.print(ch+" ");
                    if(ch=='1')
                        dig=1;
                    if(ch=='2')
                        dig=2;
                    if(ch=='3')
                        dig=3;
                    if(ch=='4')
                        dig=4;
                    if(ch=='5')
                        dig=5;
                    if(ch=='6')
                        dig=6;
                    if(ch=='7')
                        dig=7;
                    if(ch=='8')
                        dig=8;
                    if(ch=='9')
                        dig=9;
                    if(ch=='A')
                        dig=10;
                    if(ch=='B')
                        dig=11;
                    if(ch=='C')
                        dig=12;
                    if(ch=='D')
                        dig=13;
                    if(ch=='E')
                        dig=14;
                    if(ch=='F')
                        dig=15;         
                    str1=str1+dig*Math.pow(16,k);
                    k++;

                }
                System.out.println("DECIMAL value of HEXADECIMAL Number:"+str1);
                break;
                case 7:
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
                default:
                System.out.println("Wrong choice");
            }
        }
        while(choice!=8);
    }
}
