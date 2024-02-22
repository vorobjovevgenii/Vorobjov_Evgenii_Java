import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a = scanner.nextDouble();
        if (a > 7) {
            System.out.println("Привет");
        }

        System.out.println("Введите имя: ");
        String name = scanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        System.out.println("Элементы массива кратные трем: ");
        String arrayFirst = "54 76 45 78 18 67 5 ";
        String [] strArr = arrayFirst.split(" ");
        int [] numbers  = new int[strArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers [i] = Integer.parseInt(strArr[i]);
        }
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }

        /*
        ++ интерактивный ввод значений для обработки и вывод обработанных данных
         */

        System.out.println("Введите 5 элементов числового массива: ");
        int [] array = new int [5];
        for (int i = 0; i < array.length; i++){
            array [i] = scanner.nextInt();
        }
        System.out.println("Элементы числового массива кратные 3: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}

/*
Скобочная последовательность подразумевает, что открывающейся скобки должна соответствовать закрывающаяся
Ответ: [[(())()(())]]
 */