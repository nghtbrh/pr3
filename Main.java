import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("розмір байту" + Byte.SIZE + "мінімальний розмір байту" + Byte.MIN_VALUE + "максимальний розмір" + Byte.MAX_VALUE);
        System.out.println("розмір шорту" + Short.SIZE + "мінімальний розмір" + Short.MIN_VALUE + "максимальний розмір" + Short.MAX_VALUE);
        System.out.println("розмір інту" + Integer.SIZE + "мінімальний розмір" + Integer.MIN_VALUE + "максимальний розмір" + Integer.MAX_VALUE);
        System.out.println("розмір лонгу" + Long.SIZE + "мінімальний розмір байту" + Long.MIN_VALUE + "максимальний розмір" + Long.MAX_VALUE);
        System.out.println("розмір флоату" + Float.SIZE + "мінімальний розмір" + Float.MIN_VALUE + "максимальний розмір" + Float.MAX_VALUE);
        System.out.println("розмір даблу" + Double.SIZE + "мінімальний розмір" + Double.MIN_VALUE + "максимальний розмір" + Double.MAX_VALUE);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть значення для byte: ");
        String byteInput = scanner.nextLine();
        byte byteValue1 = Byte.parseByte(byteInput);
        System.out.println("Введене значення :" + byteValue1);

        System.out.println("введіть значення для short:");
        String shortInput = scanner.nextLine();
        short shortValue1 = Short.parseShort(shortInput);
        System.out.println("Введене значення :" + shortValue1);

        System.out.println("введіть значення для int:");
        String intInput = scanner.nextLine();
        int intValue1 = Integer.parseInt(intInput);
        System.out.println("Введене значення:" + intValue1);

        System.out.println("Введіть значення для long:");
        String LongInput = scanner.nextLine();
        long LongValue1 = Long.parseLong(LongInput);
        System.out.println("Введене значення: " + LongValue1);

        System.out.println("Введіть значення для float:");
        String FloatInput = scanner.nextLine();
        float FloatValue1 = Float.parseFloat(FloatInput);
        System.out.println("Введене значення: " + FloatValue1);

        System.out.println("Введіть значення double:");
        String DoubleInput = scanner.nextLine();
        double doubleValue1 = Double.parseDouble(DoubleInput);
        System.out.println("Введене значення:" + doubleValue1);

    }
}