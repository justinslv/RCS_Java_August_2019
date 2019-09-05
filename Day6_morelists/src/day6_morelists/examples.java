/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_morelists;

import java.util.ArrayList;


public class examples {
   
    
    public static void referenceSample() {
        ArrayList<String> sampleList = new ArrayList<String>();

        sampleList.add("viens");
        sampleList.add("divi");
        sampleList.add("tris");
        sampleList.add("cetri");
        
        

        int sampleInt = 5;
        sampleInt = changeInt(sampleInt);
        System.out.println("Arpus metodes- " + sampleInt);
        
        
        
        outputList(sampleList);
        
        changeList(sampleList);
        outputList(sampleList);
        
    }

    private static int changeInt(int number) {
        number = number + 6;
        
        System.out.println("Ieksa metode- " + number);
        return number;
    }

    private static void changeList(ArrayList<String> passList) {
        passList.remove(1);
        
    }

    private static void outputList(ArrayList<String> parList) {
        System.out.println("Saraksts-");

        for (int i = 0; i < parList.size(); i++) {
            System.out.println("1) " + parList.get(i));
        }
    }

}