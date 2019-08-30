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
public class ArrayTasks {

    public void switchPlaces() {
        int a = 5;
        int b = 4;

        int c = a;
        a = b;
        b = c;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);

    }

    public static void sortArray() {
        int[] arr = {7, 6, 3, 2, 9, 13};
        //sakārtot masīvu augšā secībā
        //izvadīt
    }

    public static void sumOfElements() {
        //ustaisīt masīvu ar 5 (int)elementiem
        //elementus ievada cilvēks
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Ievadiet skaitli: ");
            num[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
            sum = sum + num[i];
        }
        System.out.println("masīvs galīgi auzās ir: " + sum);
        //izvadīt masīvu
        //izvadam elementu summu
    }
}
