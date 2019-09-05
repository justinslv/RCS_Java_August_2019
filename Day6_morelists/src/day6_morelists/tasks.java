/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6_morelists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marti
 */
public class tasks {

    private ArrayList<String> nameList = new ArrayList<>();

    public void menu() {

        String choice = "";
        Scanner sc = new Scanner(System.in);

        while (!choice.equals("exit")) {
            System.out.println("1: Izvadit sarakstu");
            System.out.println("2: Pievienot jaunu elementu");
            System.out.println("3: Dzest elementu");
            System.out.println("4: Rediget elementu");
            System.out.println("exit: Iziet");

            System.out.println("Ievadiet izvelni- ");
            choice = sc.next();

            switch (choice) {
                case "1":
                    printList();
                    break;
                case "2":
                    addToList();
                    break;
                case "3":
                    deleteFromList();
                    break;
                case "4":
                    editList();
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Ievade nav pareiza!");
                    break;
            }

        }

    }

    //1) Izvadit sarakstu
    private void printList() {
        if (nameList.isEmpty()) {
            System.out.println("Saraksts ir tukss!");
        } else {
            for (int i = 0; i < nameList.size(); i++) {
                System.out.println("Indekss: " + i +  ", elements: " + nameList.get(i));
            }
            
            System.out.println();
        }

    }
    //2) Pievienot jaunu elementu

    private void addToList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet elementu, ko velaties pievienot!");
        String element = sc.next();
        
        nameList.add(element);
    }
    //3) Dzest elementu

    private void deleteFromList() {
        int index = inputListIndex();
        
        if(index > -1 && index < nameList.size()){
            nameList.remove(index);
        }else{
            System.out.println("Nepareiza ievade!");
        }
    }
    //4) Rediget elementu

    private void editList() {
        int index = inputListIndex();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ievadiet jauno vertibu!");
        String changed = sc.next();
        
        if(index > -1 && index < nameList.size()){
            nameList.set(index, changed);
        }else{
            System.out.println("Nepareiza ievade!");
        }
    }
    //5) Iziet no programmas
    
    private int inputListIndex(){
        Scanner sc = new Scanner(System.in);
        int index = -1;
        System.out.println("Ievadiet saraksta elementu- ");
        if(sc.hasNextInt()){
            index = sc.nextInt();
        }
        
        return index;
    }
    //String list
    //Validacija - .isEmpty() metode
}