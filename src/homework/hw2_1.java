package homework;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw2_1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Ваше дробное число: ");
            try{
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Ваше дробное число равно: %f\n", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Вы ввели не дробное число. Введите дробное число!!!");
            }

        }
    }
}