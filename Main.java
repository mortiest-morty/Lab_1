import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // ===================== ПРОВЕРКА ВВОДА =====================
    public int check(Scanner scanner, int min, int max) {
        while (true) {
            System.out.print("Введите число (" + min + "-" + max + "): ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= min && choice <= max) return choice;
                System.out.println("Ошибка! Число должно быть от " + min + " до " + max + ".");
            } else {
                System.out.println("Ошибка! Это не число. Введите цифру " + min + "-" + max + ".");
                scanner.next();
            }
        }
    }

    public int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) return scanner.nextInt();
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
    }

    public int[] readArray(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        int n = readInt(scanner);
        if (n < 0) n = 0;
        int[] arr = new int[n];
        if (n > 0) {
            System.out.println("Введите " + n + " чисел:");
            for (int i = 0; i < n; i++) {
                System.out.print("Элемент " + i + ": ");
                arr[i] = readInt(scanner);
            }
        }
        return arr;
    }

    // ===================== ГЛАВНОЕ МЕНЮ =====================
    public void Menu(Scanner scanner) {
        while (true) {
            System.out.println("\n===== (^-^) Какое задание вы бы хотели посмотреть? (^-^) =====");
            System.out.println(" 1 - Задание 1");
            System.out.println(" 2 - Задание 2");
            System.out.println(" 3 - Задание 3");
            System.out.println(" 4 - Задание 4");
            System.out.println(" 5 - Выход");

            int choice = check(scanner, 1, 5);
            switch (choice) {
                case 1 -> menuTask1(scanner);
                case 2 -> menuTask2(scanner);
                case 3 -> menuTask3(scanner);
                case 4 -> menuTask4(scanner);
                case 5 -> { System.out.println("Пока-пока! (^_^)/"); return; }
            }
        }
    }

    // ===================== МЕНЮ 1 =====================
    public void menuTask1(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Задание 1 ---");
            System.out.println(" 1 - № 3  (Букву в число)");
            System.out.println(" 2 - № 4  (Есть ли позитив)");
            System.out.println(" 3 - № 8  (Делитель)");
            System.out.println(" 4 - № 9  (Равенство)");
            System.out.println(" 5 - № 10 (Многократный вызов)");
            System.out.println(" 0 - Назад");

            int choice = check(scanner, 0, 5);
            if (choice == 0) return;
            switch (choice) {
                case 1 -> taskCharToNum(scanner);
                case 2 -> taskIsPositive(scanner);
                case 3 -> taskIsDivisor(scanner);
                case 4 -> taskIsEqual(scanner);
                case 5 -> taskLastNumSum(scanner);
            }
        }
    }

    // ===================== МЕНЮ 2 =====================
    public void menuTask2(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Задание 2 ---");
            System.out.println(" 1 - № 2  (Безопасное деление)");
            System.out.println(" 2 - № 5  (Тройной максимум)");
            System.out.println(" 3 - № 6  (Тройная сумма)");
            System.out.println(" 4 - № 7  (Двойная сумма)");
            System.out.println(" 5 - № 10 (Вывод дней недели)");
            System.out.println(" 0 - Назад");

            int choice = check(scanner, 0, 5);
            if (choice == 0) return;
            switch (choice) {
                case 1 -> taskSafeDiv(scanner);
                case 2 -> taskMax3(scanner);
                case 3 -> taskSum3(scanner);
                case 4 -> taskSum2(scanner);
                case 5 -> taskPrintDays(scanner);
            }
        }
    }

    // ===================== МЕНЮ 3 =====================
    public void menuTask3(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Задание 3 ---");
            System.out.println(" 1 - № 1 (Числа подряд)");
            System.out.println(" 2 - № 4 (Возведение в степень)");
            System.out.println(" 3 - № 6 (Одинаковость)");
            System.out.println(" 4 - № 7 (Квадрат)");
            System.out.println(" 5 - № 9 (Правый треугольник)");
            System.out.println(" 0 - Назад");

            int choice = check(scanner, 0, 5);
            if (choice == 0) return;
            switch (choice) {
                case 1 -> taskListNums(scanner);
                case 2 -> taskPow(scanner);
                case 3 -> taskEqualNum(scanner);
                case 4 -> taskSquare(scanner);
                case 5 -> taskRightTriangle(scanner);
            }
        }
    }

    // ===================== МЕНЮ 4 =====================
    public void menuTask4(Scanner scanner) {
        while (true) {
            System.out.println("\n--- Задание 4 ---");
            System.out.println(" 1 - № 1  (Поиск первого значения)");
            System.out.println(" 2 - № 2  (Поиск последнего значения)");
            System.out.println(" 3 - № 5  (Добавление массива в массив)");
            System.out.println(" 4 - № 8  (Конкатенация массивов)");
            System.out.println(" 5 - № 10 (Удалить негатив)");
            System.out.println(" 0 - Назад");

            int choice = check(scanner, 0, 5);
            if (choice == 0) return;
            switch (choice) {
                case 1 -> taskFindFirst(scanner);
                case 2 -> taskFindLast(scanner);
                case 3 -> taskAddArray(scanner);
                case 4 -> taskConcat(scanner);
                case 5 -> taskDeleteNegative(scanner);
            }
        }
    }

    // ============================ 1 задание ============================
    public void taskCharToNum(Scanner scanner) {
        System.out.print("Введите цифру (0-9): ");
        char x = scanner.next().charAt(0);
        System.out.println("Результат: " + charToNum(x));
    }

    public int charToNum(char x) {
        return x - '0';
    }

    public void taskIsPositive(Scanner scanner) {
        System.out.print("Введите число: ");
        int x = readInt(scanner);
        System.out.println("Результат: " + isPositive(x));
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public void taskIsDivisor(Scanner scanner) {
        System.out.print("Введите a: ");
        int a = readInt(scanner);
        System.out.print("Введите b: ");
        int b = readInt(scanner);
        System.out.println("Результат: " + isDivisor(a, b));
    }

    public boolean isDivisor(int a, int b) {
        if (a == 0 && b == 0) return false;
        if (a == 0 || b == 0) return false;
        return a % b == 0 || b % a == 0;
    }

    public void taskIsEqual(Scanner scanner) {
        System.out.print("Введите a: ");
        int a = readInt(scanner);
        System.out.print("Введите b: ");
        int b = readInt(scanner);
        System.out.print("Введите c: ");
        int c = readInt(scanner);
        System.out.println("Результат: " + isEqual(a, b, c));
    }

    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public void taskLastNumSum(Scanner scanner) {
        System.out.print("Введите первое число: ");
        int a = readInt(scanner);
        System.out.print("Введите второе число: ");
        int b = readInt(scanner);
        System.out.println("Итого: " + lastNumSum(a, b, scanner));
    }

    public int lastNumSum(int a, int b, Scanner scanner) {
        int sum = Math.abs(a % 10) + Math.abs(b % 10);
        System.out.println(a + " + " + b + " = " + sum);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число: ");
            b = readInt(scanner);
            a = sum;
            sum = Math.abs(a % 10) + Math.abs(b % 10);
            System.out.println(a + " + " + b + " = " + sum);
        }
        return sum;
    }

    // ============================ 2 задание ============================
    public void taskSafeDiv(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.print("Введите y: ");
        int y = readInt(scanner);
        System.out.println("Результат: " + safeDiv(x, y));
    }

    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    public void taskMax3(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.print("Введите y: ");
        int y = readInt(scanner);
        System.out.print("Введите z: ");
        int z = readInt(scanner);
        System.out.println("Результат: " + max3(x, y, z));
    }

    public int max3(int x, int y, int z) {
        if (x > y && x > z) return x;
        if (y > z && y > x) return y;
        return z;
    }

    public void taskSum3(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.print("Введите y: ");
        int y = readInt(scanner);
        System.out.print("Введите z: ");
        int z = readInt(scanner);
        System.out.println("Результат: " + sum3(x, y, z));
    }

    public boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }

    public void taskSum2(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.print("Введите y: ");
        int y = readInt(scanner);
        System.out.println("Результат: " + sum2(x, y));
    }

    public int sum2(int x, int y) {
        int i = 20;
        if (x + y > 9 && x + y < 20) return i;
        else return x + y;
    }

    public void taskPrintDays(Scanner scanner) {
        System.out.print("Введите день недели: ");
        String x = scanner.next();
        printDays(x);
    }

    public void printDays(String x) {
        switch (x) {
            case "Понедельник": System.out.println("Понедельник\nВторник\nСреда\nЧетверг\nПятница\nСуббота\nВоскресенье"); break;
            case "Вторник": System.out.println("Вторник\nЧетверг\nПятница\nСуббота\nВоскресенье"); break;
            case "Среда": System.out.println("Среда\nПятница\nСуббота\nВоскресенье"); break;
            case "Четверг": System.out.println("Четверг\nПятница\nСуббота\nВоскресенье"); break;
            case "Пятница": System.out.println("Пятница\nСуббота\nВоскресенье"); break;
            case "Суббота": System.out.println("Суббота\nВоскресенье"); break;
            case "Воскресенье": System.out.println("Воскресенье"); break;
            default: System.out.println("А нет такого дня недели!!! :(");
        }
    }

    // ============================ 3 задание ============================
    public void taskListNums(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.println("Результат: " + listNums(x));
    }

    public String listNums(int x) {
        if (x < 0) return "Ошибка!! Числа начинаются с 0! :(((";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < x + 1; i++) res.append(i).append(" ");
        return res.toString().trim();
    }

    public void taskPow(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        System.out.print("Введите y: ");
        int y = readInt(scanner);
        System.out.println("Результат: " + pow(x, y));
    }

    public int pow(int x, int y) {
        int n = x;
        for (int i = 1; i < y; i++) x *= n;
        return x;
    }

    public void taskEqualNum(Scanner scanner) {
        System.out.print("Введите число: ");
        int x = readInt(scanner);
        System.out.println("Результат: " + equalNum(x));
    }

    public boolean equalNum(int x) {
        int y = x % 10;
        x /= 10;
        while (x != 0) {
            if (y != x % 10) return false;
            x /= 10;
        }
        return true;
    }

    public void taskSquare(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        square(x);
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void taskRightTriangle(Scanner scanner) {
        System.out.print("Введите x: ");
        int x = readInt(scanner);
        rightTriangle(x);
    }

    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = x; j > i + 1; j--) System.out.print(" ");
            for (int w = i + 1; w > 0; w--) System.out.print("*");
            System.out.println();
        }
    }

    // ============================ 4 задание ============================
    public void taskFindFirst(Scanner scanner) {
        int[] arr = readArray(scanner);
        System.out.print("Введите число x: ");
        int x = readInt(scanner);
        System.out.println("Результат: " + findFirst(arr, x));
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        System.out.println("Такого числа в массиве нет :(");
        return -1;
    }

    public void taskFindLast(Scanner scanner) {
        int[] arr = readArray(scanner);
        System.out.print("Введите число x: ");
        int x = readInt(scanner);
        System.out.println("Результат: " + findLast(arr, x));
    }

    public int findLast(int[] arr, int x) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) n = i;
        }
        if (n > 0) return n;
        else {
            System.out.println("Такого числа в массиве нет :(");
            return -1;
        }
    }

    public void taskAddArray(Scanner scanner) {
        System.out.println("Первый массив:");
        int[] arr = readArray(scanner);
        System.out.println("Второй массив (вставляемый):");
        int[] ins = readArray(scanner);
        System.out.print("Введите позицию pos: ");
        int pos = readInt(scanner);
        System.out.println("Результат: " + Arrays.toString(add(arr, ins, pos)));
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        for (int i = 0; i < ins.length; i++) res[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) res[i + ins.length] = arr[i];
        return res;
    }

    public void taskConcat(Scanner scanner) {
        System.out.println("Первый массив:");
        int[] arr1 = readArray(scanner);
        System.out.println("Второй массив:");
        int[] arr2 = readArray(scanner);
        System.out.println("Результат: " + Arrays.toString(concat(arr1, arr2)));
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) res[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++) res[i + arr1.length] = arr2[i];
        return res;
    }

    public void taskDeleteNegative(Scanner scanner) {
        int[] arr = readArray(scanner);
        System.out.println("Результат: " + Arrays.toString(deleteNegative(arr)));
    }

    public int[] deleteNegative(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length; i++) if (arr[i] > 0) n++;
        int[] res = new int[n];
        n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[n] = arr[i];
                n++;
            }
        }
        return res;
    }

    // ============================ MAIN ============================
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main app = new Main();   
        app.Menu(scanner);      
        scanner.close();
    }
}
