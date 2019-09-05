/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_lists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marti
 */
public class tasks {

    //Uztaisit String list'u
    //Cilvekam ir 2 opcijas- pievienot jaunu vertibu vai iziet
    //ja cilveks pievieno vertibu, vins pieliek listam vienu stringu
    //un izvada sarakstu
    //ja cilveks izvelas iziet tad mes izvadam sarakstu un izejam un programmas
    //while, string list
    public static void listInput() {
        Scanner sc = new Scanner(System.in);
        String choice;

        ArrayList<String> listOfStrings = new ArrayList<String>();

        do {
            System.out.println("Ievadiet vertibu!");
            String input = sc.next();
            listOfStrings.add(input);

            for (int i = 0; i < listOfStrings.size(); i++) {
                System.out.println(listOfStrings.get(i));
            }

            System.out.println("Vai velaties turpinat, ja ne rakstat exit");
            choice = sc.next();

        } while (!choice.equals("exit"));

    }

    public static void listRemove() {

        Scanner sc = new Scanner(System.in);
        String choice;

        ArrayList<String> listOfStrings = new ArrayList<String>();

        do {
            System.out.println("Ievadiet vertibu!");
            String input = sc.next();
            listOfStrings.add(input);
            
            outputList(listOfStrings);

            System.out.println("Vai velaties turpinat, ja ne rakstat exit, ja "
                    + "velaties dzest elementu rakstiet dzest");
            choice = sc.next();

            if (choice.equals("dzest")) {
                removeElement(listOfStrings);
            }
            
            outputList(listOfStrings);

        } while (!choice.equals("exit"));

        //vai velaties izdzest elementu
        //cilveks ievada kuru saraksta elementu dzest
        //vai nu viss norit veiksmigi
        //vai ari pasakam, ka tads elements nav
    }

    private static void removeElement(ArrayList<String> parList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kuru elementu velaties dzest?");
        if (sc.hasNextInt()) {
            int index = sc.nextInt();
            if (index > -1 && index < parList.size()) {
                parList.remove(index);
            } else {
                System.out.println("Nekorekta ievade");
            }
        } else {
            System.out.println("Nekorekta ievade");
        }

    }

    private static void outputList(ArrayList<String> parList) {
        System.out.println("Saraksts-");
        
        for (int i = 0; i < parList.size(); i++) {
            System.out.println("1) " + parList.get(i));
        }
    }

}