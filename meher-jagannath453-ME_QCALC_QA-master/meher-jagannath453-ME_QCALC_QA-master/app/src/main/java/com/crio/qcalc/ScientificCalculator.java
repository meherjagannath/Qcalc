package com.crio.qcalc;

public class ScientificCalculator extends StandardCalculator{

    public static void getVersion(){
        System.out.println("Scientific Calculator 1.0");
    }

    public void sin(double a){
        result = Math.sin(a);
        printResult();
    }

    public void cos(double a) {
        result = Math.cos(a);
        printResult();
    }

    public void square(double a) {
        multiply(a, a);
        printResult();
    }

    public void tan(double a) {
        result = Math.tan(a);
        printResult();
    }
    public void log(double a) {
        result = Math.log(a);
        printResult();
    }

    public void sqrt(double a) {
        result = Math.sqrt(a);
        printResult();
    }

    public void cbrt(double a) {
        result = Math.cbrt(a);
        printResult();
    }

    @Override
    public void printResult(){
        System.out.println("Scientific Calculator Result:" + result);

    }

    
    }


    
    
    





    

