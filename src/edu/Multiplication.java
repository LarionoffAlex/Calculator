package edu;

/**
 * Created by Alex on 13.11.2016.
 */
public class Multiplication {
    private int num1I;
    private int num2I;
    private double num1D;
    private double num2D;
    private String num1S;
    private String num2S;

    public Multiplication(String num1S, String num2S) {
        this.num1S = num1S;
        this.num2S = num2S;
    }

    public Multiplication(int num1I, int num2I) {
        this.num1I = num1I;
        this.num2I = num2I;
    }

    public Multiplication(double num1D, double num2D) {
        this.num1D = num1D;
        this.num2D = num2D;
    }
    public static int doOperation(int num1I, int num2I){
        return num1I*num2I;
    }
    public static double doOperation(double num1D, double num2D){
        return num1D*num2D;
    }
    public static String doOperation(String  num1S, String  num2S) {
        return ("Impossible operation! " + num1S + " * " + num2S);
    }
}
