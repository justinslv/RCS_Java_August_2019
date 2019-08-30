/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_classes2;

import java.util.Scanner;

/**
 *
 * @author Just
 */
public class Daudzsturi {
    private double a,b,c,d;
    private int maluSkaits;
    
    
    //1. Uzstaisīt konstruktoru, kas piešķir visiem mainīgajiem vērtību 0
    
    public Daudzsturi(){
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        maluSkaits = 0;
    }
    
    
    
    //2. Uzstaisīt vēlvienu privātu mainīgo, kas atbildēs malu skaitu
        
    
    //3. Malu skaitam uzstasam set metodi ( hint - setA(int number) 
    public void setMaluSkaits(int value){
        maluSkaits = value;
    }
    
    //4. set metodi, kas piešķir vērtības mainīgajiem a,b,c,d
    public void setMalas(double mala1, double mala2, double mala3, double mala4){
        a = mala1;
        b = mala2;
        c = mala3;
        d = mala4;
    }
    
//    public void setMalas(double mala1, double mala2, double mala3){
//        a = mala1;
//        b = mala2;
//        c = mala3;
//    }
    //5. uzstaisīt metodi, kas aprēķina perimetru un ar return atgriež vērtību
    public double getPerimetrs(){
        switch(maluSkaits){
            case 3:
                return a + b + c;
            case 4:
                return a + b + c + d;
            default:
                return 0;
        }    
    }
    //obligāti jābūt pozitīviem skaitļiem - a,b,c  un d obligāti nav
    
}
