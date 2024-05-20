package seminars.first.Calculator;

import org.w3c.dom.ls.LSOutput;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // HW1.1: Придумайте и опишите (можно в псевдокоде) функцию извлечения корня и
    // необходимые проверки для него используя граничные случаи
    public static double squareRootExtraction(double num) {
        //  0
        //  Отрицательные числа
        //  Дробные значения корней
        //  Целые
            if(num < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of a negative number");
            }
            return Math.sqrt(num);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
//    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
//        // purchaseAmount - сумма покупки
//        // discountAmount - размер скидки
//            if (purchaseAmount > 20000) {
//            double totalAmount= (purchaseAmount * discountAmount)/100;
//            System.out.println(totalAmount);
//            }
//            else System.out.println("You can not have a discount");
//        return 0; // Метод должен возвращать сумму покупки со скидкой
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // Validate the input parameters
        if (purchaseAmount < 0) {
            throw new IllegalArgumentException("Purchase amount cannot be negative.");
        }
        if (discountAmount < 0 || discountAmount > 100) {
            throw new IllegalArgumentException("Discount amount must be between 0 and 100.");
        }

        // Calculate the discount
        double discount = (purchaseAmount * discountAmount) / 100.0;

        // Calculate the final price after applying the discount
        double finalPrice = purchaseAmount - discount;

        return finalPrice;

    }

}