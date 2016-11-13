package edu;

import java.util.IntSummaryStatistics;

//напиши мне Александро, калькулятор
//        даже не калькулятор, а 4 класса, которые могут выполнять арифметические действия - сложение, вычитание, умножение, деление
//
//        Целые числа можно умножать, складывать, вычитать. Результат - целое число
//        Дробные - все то же самое, но еще и делить. Результат всех операций с дробными числами - дробное число.
//        Строки - их можно складывать, результат - строка (пример "DF" + ""GJ" = "DFGJ")
public class Main {

    public static void main(String[] args) {
        // args[0] - первое число;
//        args[1] - второе число
//        args[2] - знак

        switch (args[2]){
            case ".git":
                //Multiplication multiplication=new Multiplication(args[0],args[1]);
                System.out.println(Multiplication.doOperation(num1,num2));
                break;
            case "/":
                Division division=new Division(num1,num2);
                System.out.println(division.doOperation(num1,num2));
                break;
            case "+":
                Addition addition=new Addition(num1,num2);
                System.out.println(addition.doOperation(num1,num2));
                break;
            case "-":
                Subtraction subtraction=new Subtraction(num1,num2);
                System.out.println(subtraction.doOperation(num1,num2));
                break;
            default:
                System.out.println("Unknown operation " + args[2]);
                break;
        }
//	    int num1I=10;
//        int num2I=15;
//
//        Double num1D=10.1;
//        Double num2D=15.3;
//
//        String num1S="Al";
//        String num2S="ex";
//
//
//
//        Addition addition=new Addition(num1S,num2S);
//        System.out.println(addition.doOperation(num1S,num2S));
//
//        Subtraction subtraction=new Subtraction(num1I, num2I);
//        System.out.println(subtraction.doOPeration(num1I,num2I));
    }
}

// это не сработало
// трансформация первого введенного значения
//        try {
//            int num1=Integer.parseInt(args[0]);
//        } catch (NumberFormatException e) {}
//        try {
//            double num1=Double.parseDouble(args[0]);
//        } catch (NumberFormatException e) {
//            String num1=args[0];
//        }
//
//        // трансформация второго введенного значения
//        try {
//            int num2=Integer.parseInt(args[1]);
//        } catch (NumberFormatException e) {}
//        try {
//            double num2=Double.parseDouble(args[1]);
//        } catch (NumberFormatException e) {
//            String num2=args[0];
//        }
//        String numType=args[0].getClass().getName();
//        if (numType=="Integer") {
//            int num1=Integer.parseInt(args[0]);
//        }else if (numType=="Double") {
//            double num1=Double.parseDouble(args[0]);
//        }else {
//            String num1=args[0];
//        }
