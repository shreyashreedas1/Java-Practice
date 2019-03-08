import java.util.*;

public class Msg
    {

        public static void main (String[]args){
        Scanner ob = new Scanner(System.in);
        Send snd = new Send();
        System.out.println("Enter the Addresss:");
        String adrs = ob.nextLine();
        snd.send(adrs);
        System.out.println("\n Message has been sent to " + adrs + " successfully. \n The text is: " + snd.text + " ");
    }
    }