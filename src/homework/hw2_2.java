package homework;

/**
 * Задание 2. Если необходимо, исправьте данный код:
 *
 * try {
 *    int d = 0;
 *    double catchedRes1 = intArray[8] / d;
 *    System.out.println("catchedRes1 = " + catchedRes1);
 * } catch (ArithmeticException e) {
 *    System.out.println("Catching exception: " + e);
 * }
 */

public class hw2_2 {
/** Код после исправления:*/

try

    {
        int d = 0;
        double catchedRes = intArray[8];
        System.out.printf("Result = %f", catchedRes / d);
    }
catch(
    ArithmeticException e)

    {
        e.printStackTrace();
    }
}