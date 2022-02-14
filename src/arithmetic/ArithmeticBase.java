/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 14/02/22
 */
public class ArithmeticBase 
{
        {
            public enum Operation {PLUS,MINUS,TIMES,DIVIDE};
            private Operation operation; 
            public enum ValuesPLUS,MINUS,TIMES,DIVIDE};
            private Operation operation; 
            public enum Values(x,y);
            
           
            private Operation operation;
            private Values value;

public ArithmeticBase()
{
    this.setOperation(getOperation());
    this.setValue(getValue());
}
        private double x;
        private double y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s= sc.next();
        switch (s.toUpperCase()) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }

        /**
         * @return the operation
         */
        public Operation getOperation() {
            return operation;
        }

        /**
         * @param operation the operation to set
         */
        public void setOperation(Operation operation) {
            this.operation = operation;
        }

        /**
         * @return the value
         */
        public Values getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(Values value) {
            this.value = value;
        }

        /**
         * @return the x
         */
        public double getX() {
            return x;
        }

        /**
         * @param x the x to set
         */
        public void setX(double x) {
            this.x = x;
        }

        /**
         * @return the y
         */
        public double getY() {
            return y;
        }

        /**
         * @param y the y to set
         */
        public void setY(double y) {
            this.y = y;
        }
    }
