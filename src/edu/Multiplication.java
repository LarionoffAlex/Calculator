package edu;

/**
 * Created by Alex on 13.11.2016.
 */
public class Multiplication {
    public static int doOperation(int num1, int num2){
        return num1*num2;
    }
    public static double doOperation(double num1, double num2){
        return num1*num2;
    }
    public static String doOperation(String  num1, String  num2) {
        return ("Impossible operation! " + num1 + " * " + num2);
    }
}
