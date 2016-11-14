package edu;

import java.util.SimpleTimeZone;

/**
 * Created by Alex on 14.11.2016.
 */
public class Operation {
    public static void operationProcess(int num1,int num2, String  sign){
        switch (sign){
            case ".git": // у меня почему-то звездочка определяется так
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
                System.out.println("Unknown operation " + sign);
                break;
        }
    }
    public static void operationProcess(double num1,double num2, String  sign){
        switch (sign){
            case ".git": // у меня почему-то звездочка определяется так
                //Multiplication multiplication=new Multiplication(args[0],args[1]);
                System.out.println(Multiplication.doOperation(num1,num2));
                break;
            case "/":
                Division division=new Division(num1,num2);
                System.out.println(division.doOperation(num1, num2));
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
                System.out.println("Unknown operation " + sign);
                break;
        }
    }
    public static void operationProcess(String num1, String num2, String  sign){
        switch (sign){
            case ".git": // у меня почему-то звездочка определяется так
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
                System.out.println("Unknown operation " + sign);
                break;
        }
    }
}
