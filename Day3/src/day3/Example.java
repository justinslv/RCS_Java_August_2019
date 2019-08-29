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
public class Example {
    
    //private, public 
    //static - 
    private int maluSkaits;
    public Example(){
        maluSkaits = 0;
    }

    public static void staticExample(){
        System.out.println("Static");
    }
    
    public void nonStaticExample(){
        System.out.println("NonStaticExample");
    }
    
    public void whileExample(){
        
        Scanner sc = new Scanner(System.in);
        String exit = "";
        while(!exit.equals("yes")){
            System.out.println("Izvade!");
            exit = sc.nextLine();
            exit = exit.toLowerCase();
            
        }
    }
    
    //Uzstaisam klasi ar nosaukumu tasks
    //statisku metodi kas izvada
    //*
    //**
    //***
    //**
    //*
    
    
    //uzstaisat lauku (int) ar nosakumu a
    //konstrukotra iedodat vērtību 0
    //metodei ar parametru maina vērtību vērtību mainīgajam a
    
    
    //Uzstaisīt kalkulātoru
    //Matemātiskās darbības jaunā klasē
    //vērtības mēs padodam iekša ar parametriem
    //un rezultātu atgriežam return
    
    //Main metodē Day3 klasē - izmantojam while cilku, lai uzstaisītu menu
    //
    
}
