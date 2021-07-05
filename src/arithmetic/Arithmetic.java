/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 07/05/21
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
        ArithmeticBase r= new ArithmeticBase();
        Scanner in= new Scanner(System.in);
        int N= in.nextInt();
        int m= in.nextInt();
        double result = r.calculate(m,N);
        System.out.println("result :" +result); 
    
    }
    public enum MathOperator { PLUS, MINUS, TIMES, Divide}; 

   

    public static double claculator(double num1, double num2, MathOperator op)
    {
        double num3;

        switch (op)
        {
            case PLUS:
                num3 = num1 + num2;
                return num3;
            case MINUS:
                num3 = num1 - num2;
                return num3;
            case TIMES:
                num3 = num1 * num2;
                return num3;
            case Divide:
                num3 = num1 / num2;
                return num3;
           //add default switch case for error: not all code paths return a value  bla bla..
            default:
                return 0;
        }

    }
}


