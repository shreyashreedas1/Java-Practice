import java.util.Scanner;

class StringMismatchException extends Exception {

    public StringMismatchException(String str) {

        System.out.println(str);
    }
}
public class StringExc {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String input = sc.nextLine();

        try {
            if(input.equalsIgnoreCase("India"))
                System.out.println("String matched !!!");
            else
                throw new StringMismatchException("String is not matched with INDIA");
        }
        catch (StringMismatchException e) {
            System.out.println(e);
        }
    }

}