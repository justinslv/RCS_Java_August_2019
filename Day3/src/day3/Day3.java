/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author Just
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Example ex = new Example();
        Tasks tsk = new Tasks();
        
        //tsk.tasks();
        calculator();
        //ex.nonStaticExample();
        
       // Example.staticExample();
        
        //calculator();
    }
    
    //Kalkulātors
        public static void calculator() {
        int num1;
        int num2;
        String operation;


        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo ciparu: ");
        num1 = sc.nextInt();

        System.out.println("Ievadi otru ciparu: ");
        num2 = sc.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Please enter operation: ");
        operation = op.next();

        if (operation == "+");
        {
            System.out.println("Atbilde ir: " + (num1 + num2));
        }
        if  (operation == "-");
        {
            System.out.println("Atbilde ir: " + (num1 - num2));
        }

        if (operation == "/");
        {
            System.out.println("Atbilde ir: " + (num1 / num2));
        }
        if (operation == "*")
        {
            System.out.println("Atbilde ir: " + (num1 * num2));
        }
    }

    
}
