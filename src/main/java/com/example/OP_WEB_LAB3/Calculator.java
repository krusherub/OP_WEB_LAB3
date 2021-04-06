package com.example.OP_WEB_LAB3;

public class Calculator {
    public static double calculate(double a,double b,double c,double d, String type){
        double result = Double.NaN;
        switch (type){
            case "1":
                if(d == 0)
                    return result;
                result = Math.ceil((2 * Math.cos(Math.pow(a, b)) + Math.abs(Math.acos(-1 * Math.sqrt((c/d)))))*10000)/10000;
                break;
            case "2":
                if(b == 0)
                    return result;
                result = Math.ceil(Math.pow(4 * Math.cosh( Math.sqrt( Math.abs(a/b) ) )+3 * Math.acos(d), c)*10000)/10000;
                break;
            case "3":
                if(a == 0)
                    return result;
                result = Math.ceil((3 * ((Math.log10(Math.abs(b/a)))) + Math.sqrt(Math.sin(c) + Math.pow(Math.E, d)))*10000)/10000;
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + type);
        }
        return result;
    }
}
