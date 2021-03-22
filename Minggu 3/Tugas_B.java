/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author dwiki
 */
public class Tugas_B {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Masukan jumlah nilai untuk Array random Number : ");
        int v = a.nextInt();
        int[] randomNumber = new int[v];

        // input nilai
        for (int i = 0; i < v; i++) {
            System.out.print("Nilai ke-" + i + " : ");
            randomNumber[i] = a.nextInt();
        }

        // output nilai
        System.out.print("Nilai array : ");
        System.out.print(" [ ");
        for (int i : randomNumber) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}
