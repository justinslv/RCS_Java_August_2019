/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_loops;

import java.util.Scanner;

/**
 *
 * @author Just
 */
public class Day2_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //loops(); 
       //stars();
       //someOfNumbers();
       //factorial();
       //longestSimbol();
       raise();
    }
    
//    public static void loops(){
//        //for, while, for-each , do ... while 
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//    }
//
//    public static void stars(){
//        
//        String output = "";
//        for (int i = 1; i < 10; i++) {
//            output = output + "*";
//            System.out.println(output);
//        }
//    }
    
//    public static void someOfNumbers(){
//        
//        Scanner sc = new Scanner(System.in);
//
//        //cilvēks ievada 3 skaitļus un mes tos saskaitam
//        //Jauzstaisa kur glabāt summu
//        // ciklā mēs laujam cilvēkam ievadīt skaitli
//        //pieskatit summai
//        //arpus cikla jaizvada skaitlis
//        
//        int sum = 0;
//        
//        for (int i = 0; i < 3; i++) {
//            
//            System.out.println("Ievadiet skaitli: ");
//            int number = sc.nextInt();
//            sum = sum + number;
//        }
//        System.out.println("Aprēķins ir: " + sum);
//    }
    
//    public static void factorial(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ievadiet skaitli: ");
//        int number = sc.nextInt();
//        //for cikls, kas aprēķina faktoriālu
//        int fact = 1;
//        
//        for (int i = 1; i <= number; i++) {
//            
//            fact = fact * i;
//        }
//        System.out.println("Aprēķins ir: " + fact);
//    }
    
    //1.
    //cilvēks ievada 5 skaitlus 
    // mes atrodam lielāko skaitli
    // ievade notiek for cikla
    // hint -  skaitli, kur mums glabājas lielākais
    // ieksa cikla bus ari if, kas parbauda, vai tikko ievadītais 
    // ir lielāks par pēdējo ievadīto skaitli
    //special case -  ja visi skaitli ir negatīvi
    
    //2
    //Cilvēks ievada skaitli, kuru kāpināt
    // cilvēks ievada pakāpi
    //far for ciklu kāpina
    
    //test-
    // cilvēks ievada 2
    // cilvēks ievada pakāpi = 3
    //2*2*2
    //rezultāts ir 8
    
    // līdzīgi kā faktoriāls
    
//        static public void longestSimbol(){
//        Scanner sc = new Scanner (System.in);
//
//        int number;
//        long biggest = Integer.MIN_VALUE;
//        
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Enter number: ");
//            number = sc.nextInt();
//            
//            if (number > biggest) {
//                biggest = number;
//            }
//        }
//        System.out.println("Biggest value is: " + biggest);
//    }       
    
   
   
public static void raise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli, kuru reizināt: ");
        
        int number = sc.nextInt();
        System.out.println("Ievadiet skaitli, kurā pakāpē kāpināt: ");
        
        int raise = sc.nextInt();
        int  result = number;

            for (int i = 1; i < raise; i++){ // varēju atstāt i = 2 un <= vai šādu variantu
            result =  result * number;
           
        }
        System.out.println("Kāpinājums ir: " + result);      
    }

   
//    public static void raise(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ievadiet skaitli, kuru reizināt: ");
//        int number = sc.nextInt();
//        System.out.println("Ievadiet skaitli, kurā pakāpē kāpināt: ");
//        int raise = sc.nextInt();
//        System.out.println("Kāpinājuma summa: "+ Math.pow(number, raise));
//            // bija bik savādāk - math.pow bija citā rindā, vnk šito ienesu augšā
//        }
}
    


