import java.util.Scanner;
import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

//за допомогою println

        System.out.println("введіть число з плаваючею точкою(double): ");
        Double doubleValue = scanner.nextDouble();

        System.out.println("введіть нове число(int)");
        Integer intValue = scanner.nextInt();

        scanner.nextLine();

        System.out.println("запишіть логічне значення(bool): ");
        Boolean boolValue = scanner.nextBoolean();

        System.out.println("введіть строку(string): ");
        String stringValue = scanner.nextLine();

        System.out.println("\nDouble: " + doubleValue + "Int: " + intValue + "\n Bool: " + boolValue + "\n String: " + stringValue);

//за допомогою System.out.format

        System.out.format("десятичне: %d%n шістнадцятичне: %x%n восьметичне: %o%n плаваюча: %.3f%n строка: %.3s%n логічна: %b%n", intValue, intValue, intValue, doubleValue, stringValue, boolValue);

//теж за допомогою System.out.format

        boolean isMarried = false;
        short age = 34;
        String name = "hunterkillerfantomassasin259";
        String player_class = "Rogue";

        String format = "Hi,my user is %s , Im %d years old , my marriage status : %s , because i have no private life.";

        System.out.printf(format , name , age , player_class);
        //чомусь не працювало Boolean to string

//За допомогою message format

 String template = "\nОтримав за минулий проєкт : {0,number,currency}, Знижка: {1,number,percent}";

 double MoneyForTheProject = 2400;
 double Discount = 0.30;

 String message = MessageFormat.format(template, MoneyForTheProject, Discount);
 System.out.println(message);

 scanner.close();

    }
}