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
public class Tugas_A {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String NIM = s.nextLine();

        if (null == NIM) {
            System.out.println("NIM yang anda masukan tidak ada");
        }

        switch (NIM) {
            case "E41200694":
                System.out.println("NIM\t: E41200694");
                System.out.println("NAMA\t: PRASETYO DWIKI NUGROHO");
                break;
            case "E41200695":
                System.out.println("NIM\t: E41200695");
                System.out.println("NAMA\t: MUHAMMAD SHOLEH");
                break;
            default:
                System.out.println("NIM yang anda masukan tidak ada");
                break;
        }
    }
}
