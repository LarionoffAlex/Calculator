package edu;

/**
 * Created by Alex on 13.11.2016.
 */
public class Subtraction {
    private int num1I;
    private int num2I;
    private double num1D;
    private double num2D;
    private String num1S;
    private String num2S;

    public Subtraction(String num1S, String num2S) {
        this.num1S = num1S;
        this.num2S = num2S;
    }

    public Subtraction(int num1I, int num2I) {
        this.num1I = num1I;
        this.num2I = num2I;
    }

    public Subtraction(double num1D, double num2D) {
        this.num1D = num1D;
        this.num2D = num2D;
    }

    public double doOperation(double num1I, double num2I) {
        return num1I - num2I;
    }

    public double doOPeration(double num1D, double num2D) {
        return num1D - num2D;
    }

    public String doOperation(String num1S, String num2S) {
        return ("Impossible operation! " + num1S + " - " + num2S);
    }
}
