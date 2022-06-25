package homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int varA = 5;
        int varB = 4;
        int result = varA + varB;
        System.out.println(result);

        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor() {
        int value = 122;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        else if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    static void compareNumbers() {
        int numA = 27;
        int numB = 29;

        if (numA >= numB) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}
