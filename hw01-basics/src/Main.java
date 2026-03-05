import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите метод (1-5):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                greetings();
                break;
            case 2:
                checkSign(3, 6, -18);
                break;
            case 3:
                selectColor();
                break;
            case 4:
                compareNumbers(8, 3);
                break;
            case 5:
                addOrSubtractAndPrint(5, 2, true);
                break;
            default:
                System.out.println("Такого метода нет.");
        }
        scanner.close();
    }

    private static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    private static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(
                sum >= 0 ? "Сумма положительная." : "Сумма отрицательная.");
    }

    private static void selectColor() {
        int data = 15;
        selectColor(data);
    }

    private static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = 10;
        int b = 20;
        compareNumbers(a, b);
    }

    private static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result = increment ? initValue + delta : initValue - delta;
        System.out.println(result);
    }
}
