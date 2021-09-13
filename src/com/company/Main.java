package com.company;

public class Main {
    public static double multiadd (double a, double b, double c) {
        double y = a*b+c;
        return y;
    }
    public static double expSum(double x) {
        return multiadd(x * Math.exp(-x),1,Math.sqrt(1-Math.exp(-x)));
    }
    public static void main(String[] args) {
	// write your code here
    //    multiadd(1.0,2.0,3.0);
        System.out.println(multiadd(1.0,2.0,3.0));
        System.out.println(multiadd(1.0, Math.sin(Math.PI/4),Math.cos(Math.PI/4)/2));
        System.out.println(multiadd(1.0, Math.log(10),Math.log(20)));
        System.out.println(expSum(1));
    }
}
