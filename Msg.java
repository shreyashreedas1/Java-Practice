import java.util.*;

	interface Sms
	{
	void  send(String address);
	}

	class Send implements Sms
	{
	Scanner sc=new Scanner(System.in);
	public String text;
	public void send(String address)
	{
	String s;
	System.out.println("Enter The Text:");
	s=sc.nextLine();
	text=s;
	}
	}

	
		public class Msg
		{
		public static void main(String[] args)
		{
		Scanner ob=new Scanner(System.in);
		Send snd=new Send();
		System.out.println("Enter the Addresss:");
		String adrs=ob.nextLine();
		snd.send(adrs);System.out.println("\n Message has been sent to "+adrs+" successfully. \n The text is: "+snd.text+ " ");
		}
		}
	
