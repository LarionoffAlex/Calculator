package edu;

//напиши мне Александро, калькулятор
//        даже не калькулятор, а 4 класса, которые могут выполнять арифметические действия - сложение, вычитание, умножение, деление
//        Целые числа можно умножать, складывать, вычитать. Результат - целое число
//        Дробные - все то же самое, но еще и делить. Результат всех операций с дробными числами - дробное число.
//        Строки - их можно складывать, результат - строка (пример "DF" + ""GJ" = "DFGJ")
public class Main {
    public static void main(String[] args) {
        // args[0] - первое число;
//        args[1] - второе число
//        args[2] - знак
        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            // do magic with ints
            Operation.operationProcess(num1, num2, args[2]);
        } catch (NumberFormatException e) {
        }
        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            // do magic with doubles
            Operation.operationProcess(num1, num2, args[2]);
        } catch (NumberFormatException e) {
            String num1 = args[0];
            String num2 = args[1];
            // do magic with string
            Operation.operationProcess(num1, num2, args[2]);
        }
    }
}

// второй вариант
//        String numType=args[0].getClass().getName();
//        if (numType=="Integer") {
//            int num1=Integer.parseInt(args[0]);
//        }else if (numType=="Double") {
//            double num1=Double.parseDouble(args[0]);
//        }else {
//            String num1=args[0];
//        }
