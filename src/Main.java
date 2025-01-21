import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    /* 1. Функция для нахождения максимума
    public static void main(String[] args) {

        try {
            System.out.println(max(5, 10));
            System.out.println(max(10, 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int max(int a, int b) {
        if (a == b) {
            throw new RuntimeException("Числа равны, ошибка");
        }
        return (a > b) ? a : b;
    }
     */

    /* 2. Калькулятор деления
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2));
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a / b;
    }
     */

    /* 3. Конвертер строк в числа
    public static void main(String[] args) {
        try {
            System.out.println(convertToInt("123"));
            System.out.println(convertToInt("abc"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно преобразовать строку в число");
        }
    }
     */

    /* 4. Проверка возраста
    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Неверный возраст");
        }
    }
     */

    /* 5. Нахождение корня
    public static void main(String[] args) {
        try {
            System.out.println(sqrt(9));
            System.out.println(sqrt(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double sqrt(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }
     */


    /* 6. Факториал
    public static void main(String[] args) {
        try {
            System.out.println(factorial(5));
            System.out.println(factorial(-5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
     */

    /* 7. Проверка массива на нули
    public static void main(String[] args) {
        try {
            checkForZero(new int[]{1, 2, 3});
            checkForZero(new int[]{1, 0, 3});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForZero(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new RuntimeException("Массив содержит ноль");
            }
        }
    }
     */

    /* 8. Калькулятор возведения в степень
    public static void main(String[] args) {
        try {
            System.out.println(power(2, 3));
            System.out.println(power(2, -3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double power(int base, int exponent) {
        if (exponent < 0) {
            throw new RuntimeException("Степень не может быть отрицательной");
        }
        return Math.pow(base, exponent);
    }
     */

    /* 9. Обрезка строки
    public static void main(String[] args) {
        try {
            System.out.println(trimString("Hello, world!", 5));
            System.out.println(trimString("Hello", 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String trimString(String str, int length) {
        if (length > str.length()) {
            throw new RuntimeException("Число символов больше длины строки");
        }
        return str.substring(0, length);
    }
     */

    /* 10. Поиск элемента в массиве
    public static void main(String[] args) {
        try {
            System.out.println(findInArray(new int[]{1, 2, 3}, 2));
            System.out.println(findInArray(new int[]{1, 2, 3}, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new RuntimeException("Элемент не найден в массиве");
    }
     */

    /* 11. Конвертация в двоичную систему
    public static void main(String[] args) {
        try {
            System.out.println(toBinary(10));
            System.out.println(toBinary(-10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String toBinary(int number) {
        if (number < 0) {
            throw new RuntimeException("Число не может быть отрицательным");
        }
        return Integer.toBinaryString(number);
    }
     */

    /* 12. Проверка делимости
    public static void main(String[] args) {
        try {
            System.out.println(isDivisible(10, 2));
            System.out.println(isDivisible(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a % b == 0;
    }
     */

    /*13. Чтение элемента списка
    public static void main(String[] args) {
        try {
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            System.out.println(getElement(list, 1));
            System.out.println(getElement(list, 5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getElement(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }
     */

    /* 14. Парольная проверка
    public static void main(String[] args) {
        try {
            checkPassword("strongPass");
            checkPassword("weak");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkPassword(String password) {
        if (password.length() < 8) {
            throw new RuntimeException("Пароль слишком слабый");
        }
    }
     */

    /* 15. Проверка даты
    public static void main(String[] args) {
        try {
            System.out.println(checkDate("12.05.2023"));
            System.out.println(checkDate("12-05-2023"));
        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static LocalDate checkDate(String date) {
        try {
            return LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Неверный формат даты!", date, 0);
        }
    }
     */

    /* 16. Конкатенация строк
    public static void main(String[] args) {
        try {
            System.out.println(concatenateStrings("Hello", "World"));
            System.out.println(concatenateStrings(null, "World"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }
     */

    /* 17. Остаток от деления
    public static void main(String[] args) {
        try {
            System.out.println(modulus(10, 3));
            System.out.println(modulus(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int modulus(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return a % b;
    }
     */

    /* 18. Квадратный корень
    public static void main(String[] args) {
        try {
            System.out.println(squareRoot(16));
            System.out.println(squareRoot(-4));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }
     */

    /* 19. Конвертер температуры
    public static void main(String[] args) {
        try {
            System.out.println(celsiusToFahrenheit(0));
            System.out.println(celsiusToFahrenheit(-300));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return celsius * 9/5 + 32;
    }
     */

     /*20. Проверка строки на пустоту
    public static void main(String[] args) {
        try {
            checkString("");
            checkString("Hello");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Строка пустая или равна null");
        }
    }*/






}