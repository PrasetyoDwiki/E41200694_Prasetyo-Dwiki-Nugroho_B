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
public class Tugas_B_Kelipatan {
    public static void main(String[] args) {
        System.out.println("         Do_While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("===========================");
        
        int i = 1;
                do {
                    System.out.print( i +" ");
                    i=i+2;
                } while ( i <= 100);
    }
}

