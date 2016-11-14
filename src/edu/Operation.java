package edu;

/**
 * Created by Alex on 14.11.2016.
 */
public class Operation {
    public static void operationProcess(int num1, int num2, String sign) {
        switch (sign) {
            case ".git": // у меня почему-то так определяет *
                System.out.println(Multiplication.doOperation(num1, num2));
                break;
            case "/":
                System.out.println(Division.doOperation(num1, num2));
                break;
            case "+":
                System.out.println(Addition.doOperation(num1, num2));
                break;
            case "-":
                System.out.println(Subtraction.doOperation(num1, num2));
                break;
            default:
                System.out.println("Unknown operation " + sign);
                break;
        }
    }

    public static void operationProcess(double num1, double num2, String sign) {
        switch (sign) {
            case ".git": // у меня почему-то так определяет *
                //Multiplication multiplication=new Multiplication(args[0],args[1]);
                System.out.println(Multiplication.doOperation(num1, num2));
                break;
            case "/":
                System.out.println(Division.doOPeration(num1, num2));
                break;
            case "+":
                System.out.println(Addition.doOperation(num1, num2));
                break;
            case "-":
                System.out.println(Subtraction.doOperation(num1, num2));
                break;
            default:
                System.out.println("Unknown operation " + sign);
                break;
        }
    }

    public static void operationProcess(String num1, String num2, String sign) {
        switch (sign) {
            case ".git": // у меня почему-то так определяет *
                //Multiplication multiplication=new Multiplication(args[0],args[1]);
                System.out.println(Multiplication.doOperation(num1, num2));
                break;
            case "/":
                System.out.println(Division.doOperation(num1, num2));
                break;
            case "+":
                System.out.println(Addition.doOperation(num1, num2));
                break;
            case "-":
                System.out.println(Subtraction.doOperation(num1, num2));
                break;
            default:
                System.out.println("Unknown operation " + sign);
                break;
        }
    }

}

