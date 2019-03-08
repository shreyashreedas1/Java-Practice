import java.util.*;
class Send implements Sms {
    public String text;
    Scanner sc = new Scanner(System.in);

    public void send(String address) {
        String s;
        System.out.println("Enter The Text:");
        s = sc.nextLine();
        text = s;
    }
}

