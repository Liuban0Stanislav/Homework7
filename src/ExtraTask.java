public class ExtraTask {
    public static void main(String[] args) {
        task4();
        task5();
        ifNumFibonacci(565896325);
    }

    private static void ifNumFibonacci(int num) {
        System.out.println("Является ли число, числом Фибоначчи");

        int numFibonacci1 = 0;
        int numFibonacci2 = 1;
        System.out.print(numFibonacci1 + " " + numFibonacci2 + " ");
        int rezFibonacci;

        do {
            rezFibonacci = numFibonacci1 + numFibonacci2;
            numFibonacci1 = numFibonacci2;
            numFibonacci2 = rezFibonacci;
            System.out.print(rezFibonacci + " ");
        } while (rezFibonacci < num);
        System.out.println();

        if (num == numFibonacci1 || num == numFibonacci2){
            System.out.println("Заданное число - " + num + ", является числом Фибоначчи");
        } else {
            System.out.println("Число не выходит в ряд Фибоначчи");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Повышенная сложность. Задание 5");

        int numFibona44i1 = 0;
        int numFibona44i2 = 1;
        System.out.print(numFibona44i1 + " " + numFibona44i2 + " ");
        int rezFibona44i;

        for (int i = 1; i < 9; i++) {
            rezFibona44i = numFibona44i1 + numFibona44i2;
            numFibona44i1 = numFibona44i2;
            numFibona44i2 = rezFibona44i;

            System.out.print(rezFibona44i + " ");
        }
        System.out.println();
        System.out.println();
    }

    private static void task4() {
        System.out.println("Повышенная сложность. Задание 4");

        for (int i = 1; i <= 30; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": ping pong");
            } else if (i % 5 == 0) {
                System.out.println(i + ": pong");
            } else if (i % 3 == 0) {
                System.out.println(i + ": ping");
            } else {
                System.out.println(i + ": ");
            }
        }
        System.out.println();
    }
}
