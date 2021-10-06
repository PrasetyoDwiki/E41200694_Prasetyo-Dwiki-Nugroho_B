/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author dwiki
 */
public class Tugas_C {
    public static void main(String[] args) {
        int[][] angka = {
            {1, 9, 2, 4},
            {7, 3, 8, 3},
            {9, 5, 6, 2},
            {3, 5, 8, 7}
        };
        
        for (int[] angka1 : angka) {
            System.out.print("[ ");
            for (int b = 0; b < 4; b++) {
                System.out.print(angka1[b] + " ");
            }
            System.out.println("]");
        }
    }
}
