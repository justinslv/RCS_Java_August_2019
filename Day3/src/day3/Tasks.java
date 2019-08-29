/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

public class Tasks {

    public void tasks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet cik gribat MAX garumu * : ");
        int kebabs = sc.nextInt();
        
        for (int i = 0; i < kebabs; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int k = (kebabs - 1); k >= 0; k--) {
            for (int j = 0; j <= k; j++) {
            }
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void pyramid2() {
        //String[] stars = new String[4];
        String[] stars = {"*", "**", "***", "****"};

        for (int i = 0; i < 4; i++) {
            System.out.println(stars[i]);
        }
        for (int i = 2; i >= 0; i--) {
            System.out.println(stars[i]);
        }
    }
}
