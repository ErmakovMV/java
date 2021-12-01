package homeWork1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -3;
        int b = 0;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value;
        value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100 && value > 0) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
        }

        private static void compareNumbers() {
        int a = 16;
        int b = 23;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        }
    }

