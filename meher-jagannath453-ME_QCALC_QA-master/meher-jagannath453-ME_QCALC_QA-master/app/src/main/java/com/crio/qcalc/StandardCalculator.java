package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion(){

        System.out.println("Standard Calculator 1.0");
    }

   protected double result;

   public double getResult(){

    return  (double) result;

   }

   public void setResult(int value){

    if(value != 0)

    return;

    this.result=value;

   }

   public void clearResult(){

    result = 0;

   }

   public void printResult(){

    System.out.println("Standard Calculator Result:"+ result);

   }

   public final void add(int num1,int num2){

    result = num1 + num2 ;

   }

   public final void subtract(int num1,int num2){

    result = num1 - num2 ;

   }

   public final void multiply(int num1,int num2){

    result = num1 * num2 ;

   }

   public final void divide(int num1, int num2) {

    if (num2 == 0) {

        throw new ArithmeticException("Cannot divide by zero");
   
    }

    result = num1 / num2 ;
}

//    new implementation for Overloaded Methods 

//     public void add(double num1, double num2) {

//         result = num1 + num2;
//     }

//     public void subtract(double num1, double num2) {
//         result = num1 - num2;
//     }

//     public void multiply(double num1, double num2) {
//         result = num1 * num2;
//     }

//     public void divide(double num1, double num2) {
//         if (num2 == 0) {
//             throw new ArithmeticException("Cannot divide by zero");
//         }
//         result = num1 / num2;
//     }



//new implention For throw keyword

public final void add(double num1, double num2){

    double result = num1 + num2;

    if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}
public final void subtract(double num1, double num2){

    double result = num1 - num2;

    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){

        throw new ArithmeticException("Double overflow");

    }

    this.result = result;

}

public final void multiply(double num1, double num2) {
    double result = num1 * num2;

    if ((result == Double.POSITIVE_INFINITY) || (result == Double.NEGATIVE_INFINITY)) {
        throw new ArithmeticException("Double overflow or underflow");
    }

    this.result = result;
}

public final void divide(double num1, double num2) {
    if (num2 == 0.0) {
        throw new ArithmeticException("Division by zero");
    }

    double result = num1 / num2;
    this.result = result;
}

    public void sin(double d) {}

    public void cos(double d) {}

    public void tan(double d) {}

    public void log(double d) {}

    public void sqrt(double d) {}

    public void square(double d) {}

    public void cbrt(double d) {}



}



